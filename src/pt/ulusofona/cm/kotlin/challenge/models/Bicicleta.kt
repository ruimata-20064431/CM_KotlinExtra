package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta : Veiculo, Movimentavel, DateFormat{
    override var x: Int = 0
    override var y: Int = 0

    constructor (identificador: String) : super(identificador)


    override fun toString(): String{
        return "Bicicleta | $identificador | ${dateToString(dataDeAquisicao)} | $posicao"
    }
}