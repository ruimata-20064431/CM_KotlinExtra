package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Bicicleta : Veiculo, Movimentavel, DateFormat{
    override var x: Int
    override var y: Int

    constructor (identificador: String) : super(identificador){
        this.identificador = identificador
        this.x = 0
        this.y = 0
    }


    override fun toString(): String{
        return "Bicicleta | $identificador | ${dateToString(dataDeAquisicao)} | $posicao"
    }
}