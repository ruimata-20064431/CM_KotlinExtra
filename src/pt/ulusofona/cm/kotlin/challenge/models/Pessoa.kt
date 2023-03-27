package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

class Pessoa : Movimentavel, DateFormat{

    var nome                : String private set
    var veiculos            : MutableList<Veiculo> private set
    var dataDeNascimento    : Date
    var carta               : Carta? //private set
    var posicao             : Posicao

    constructor(nome: String,
                dataDeNascimento: Date){
        this.nome                   = nome
        this.dataDeNascimento       = dataDeNascimento
        this.veiculos               = mutableListOf<Veiculo>()
        this.carta                  = null
        this.posicao                = Posicao(0,0)
    }
    constructor(
        nome                        : String,
        veiculos                    : MutableList<Veiculo>,
        dataDeNascimento            : Date,
        carta                       : Carta,
        posicao                     : Posicao
    ) {
        this.nome                   = nome
        this.veiculos               = veiculos
        this.dataDeNascimento       = dataDeNascimento
        this.carta                  = null
        this.posicao                = posicao
    }

    fun Pessoa (nome: String, dataDeNascimento: Date){
        this.nome                   = nome
        this.dataDeNascimento      = dataDeNascimento
        this.veiculos               = mutableListOf<Veiculo>()
        this.carta                 = Carta()
        this.posicao               = Posicao(0, 0)
    }

    fun comprarVeiculo(veiculo: Veiculo){
        veiculo.registaAquisicao(currentDate())
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String) : Veiculo {
        var index = veiculos.indexOfFirst { it.lerIdentificador() == identificador }
        if (index == -1) throw VeiculoNaoEncontradoException("Veiculo $identificador não existe")

        return veiculos[index]
    }

    fun venderVeiculo(identificador : String, comprador : Pessoa){
        // remover veiculo da pessoa
        var veiculo = pesquisarVeiculo(identificador)
        veiculos.remove(veiculo)
        comprador.comprarVeiculo(veiculo)
    }

    fun moverVeiculoPara(identificador: String, x: Int, y: Int){
        var veiculo = pesquisarVeiculo(identificador)
        if (veiculo.requerCarta() && !temCarta()) {
            throw PessoaSemCartaException("$nome não tem carta para conduzir o veículo indicado")
        }
        veiculo.moverPara(x, y)
        this.posicao.alterarPosicaoPara(x, y)
    }

    fun adulto(): Boolean{
        return age(dataDeNascimento) >= 18
    }

    fun temCarta(): Boolean {
        return carta != null
    }

    fun tirarCarta(){
        if (!adulto()) throw MenorDeIdadeException("Menores não podem tirar a carta")
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }

    override fun toString(): String{
        return "Pessoa | $nome | ${Util.dateToString(dataDeNascimento)} | " +
                "$posicao"
    }
}