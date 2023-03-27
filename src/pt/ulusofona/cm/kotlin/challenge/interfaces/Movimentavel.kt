package pt.ulusofona.cm.kotlin.challenge.interfaces

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

interface Movimentavel {

    var x : Int
    var y : Int
    fun moverPara(x: Int, y: Int){
        if (this.x == x && this.y == y) throw AlterarPosicaoException("Já se encontra nessa posição")
        else {
            this.x = x
            this.y = y
        }
    }
}