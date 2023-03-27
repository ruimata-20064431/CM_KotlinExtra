package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro: Veiculo, Movimentavel {
    private var _motor          : Motor

    override var _x: Int
        get()  { return _x }
        set(a) { if (a == a) a else a } //...
    override var _y: Int
        get() = _y
        set(a) { if (a == a) a else a } //...
    constructor(_identificador: String, motor: Motor) : super(_identificador){
        _motor = motor
        _exigeCarta = true
    }

    override fun toString(): String{
        return "Carro | $_identificador | $_dataDeAquisicao | " +
                "$_dataDeAquisicao | $_posicao"
    }
}