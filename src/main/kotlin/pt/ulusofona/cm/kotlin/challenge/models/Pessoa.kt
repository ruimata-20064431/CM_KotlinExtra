package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Pessoa {

    private var _nome: String
    private var _veiculos: MutableList<Veiculo>
    private var _dataDeNascimento: Date
    private var _carta: Carta
    private var _posicao: Posicao

    constructor(
        nome: String,
        veiculos: MutableList<Veiculo>,
        dataDeNascimento: Date,
        carta: Carta,
        posicao: Posicao
    ) {
        this._nome = nome
        this._veiculos = veiculos
        this._dataDeNascimento = dataDeNascimento
        this._carta = carta
        this._posicao = posicao
    }

    fun Pessoa (nome: String, dataDeNascimento: Date){
        this._nome = nome
        this._dataDeNascimento = dataDeNascimento
        this._veiculos = mutableListOf<Veiculo>()
        this._carta = Carta()
        this._posicao = Posicao()
    }

    fun comprarVeiculo(veiculo: Veiculo){
        _veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String) : Veiculo {

        _veiculos.filter { cat -> cat.id in listOfIds }
    }

    fun venderVeiculo(identificador : String, comprador : Pessoa){

    }

    fun moverVeiculo(identificador: String, x: Int, y: Int){

    }

    fun temCarta(): Boolean {

    }

    fun tirarCarta(){

    }

}