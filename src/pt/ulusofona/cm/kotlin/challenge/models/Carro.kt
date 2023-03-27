package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro: Veiculo, Movimentavel, Ligavel {
    private var motor          : Motor
    override var ligado         : Boolean = false

    constructor(identificador: String, motor: Motor) : super(identificador){
        this.motor = motor
        exigeCarta = true
    }

    override fun toString(): String{
        return "Carro | $identificador | ${dateToString(dataDeAquisicao)} | $posicao"
    }
}