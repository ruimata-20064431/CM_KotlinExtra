package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro: Veiculo, Movimentavel {
    private var _motor          : Motor

    override var x: Int
        get()  { return x }
        set(a) { if (a == a) a else a } //...
    override var y: Int
        get() = y
        set(a) { if (a == a) a else a } //...
    constructor(_identificador: String, motor: Motor) : super(_identificador){
        _motor = motor
        exigeCarta = true
    }

    override fun toString(): String{
        return "Carro | $identificador | $dataDeAquisicao | " +
                "$dataDeAquisicao | $posicao"
    }
}