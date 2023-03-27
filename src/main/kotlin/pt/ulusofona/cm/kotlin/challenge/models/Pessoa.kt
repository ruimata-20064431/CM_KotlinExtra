package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import java.util.*

class Pessoa : DateFormat{

            var nome                : String private set
            var veiculos            : MutableList<Veiculo> private set
    private var _dataDeNascimento   : Date
            var carta               : Carta? private set
    private var _posicao            : Posicao

    constructor(nome: String,
                dataDeNascimento: Date){
        this.nome                   = nome
        _dataDeNascimento           = dataDeNascimento
        veiculos                    = mutableListOf<Veiculo>()
        carta                       = null
        _posicao                    = Posicao(0,0)
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
        this._dataDeNascimento      = dataDeNascimento
        this.carta                 = null
        this._posicao               = posicao
    }

    fun Pessoa (nome: String, dataDeNascimento: Date){
        this.nome                   = nome
        this._dataDeNascimento      = dataDeNascimento
        this.veiculos               = mutableListOf<Veiculo>()
        this.carta                 = Carta()
        this._posicao               = Posicao(0, 0)
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

    fun moverVeiculo(identificador: String, x: Int, y: Int){
        var veiculo = pesquisarVeiculo(identificador)
        if (veiculo.requerCarta() && !temCarta())
            throw PessoaSemCartaException("$nome não tem carta para conduzir o veículo indicado")

        veiculo.movePara(x, y)
        this._posicao.alterarPosicaoPara(x, y)
    }

    fun adulto(): Boolean{
        return age(_dataDeNascimento) >= 18
    }

    fun temCarta(): Boolean {
        return carta != null
    }

    fun tirarCarta(){
        if (!adulto()) throw MenorDeIdadeException("Menores não podem tirar a carta")
    }

    override fun toString(): String{
        return "Pessoa | $nome | ${Util.dateToString(_dataDeNascimento)} | " +
                "$_posicao"
    }
}