package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro: Veiculo, Ligavel {
    private var _motor          : Motor
    override var ligado         : Boolean = false

    constructor(_identificador: String, motor: Motor) : super(_identificador){
        _motor = motor
        exigeCarta = true
    }

    override fun toString(): String{
        return "Carro | $identificador | $dataDeAquisicao | " +
                "$dataDeAquisicao | $posicao"
    }
}