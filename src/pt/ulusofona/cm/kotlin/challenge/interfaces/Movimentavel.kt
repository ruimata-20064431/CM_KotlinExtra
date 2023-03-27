package pt.ulusofona.cm.kotlin.challenge.interfaces

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

interface Movimentavel {

    var _x : Int
    var _y : Int
    fun moverPara(x: Int, y: Int){
        if (_x == x && _y == y) throw AlterarPosicaoException("Já se encontra nessa posição")
        else {
            _x = x
            _y = y
        }
    }
}