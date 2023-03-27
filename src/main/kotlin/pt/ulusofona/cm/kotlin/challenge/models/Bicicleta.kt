package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta : Veiculo, Movimentavel, DateFormat{
    override var _x: Int = 0
    override var _y: Int = 0

    constructor (identificador: String) : super(identificador)


    override fun toString(): String{
        return "Bicicleta | $_identificador | ${dateToString(_dataDeAquisicao)} | $_posicao"
    }
}