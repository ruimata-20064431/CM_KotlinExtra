package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta : Veiculo, DateFormat{

    constructor (identificador: String) : super(identificador){
        this.identificador = identificador
    }

    override fun toString(): String{
        return "Bicicleta | $identificador | ${dateToString(dataDeAquisicao)} | $posicao"
    }
}