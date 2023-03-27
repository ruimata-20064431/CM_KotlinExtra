package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Posicao (var x: Int, var y: Int){

    fun alterarPosicaoPara(x: Int, y: Int){
        if (this.x == x && this.y == y) throw AlterarPosicaoException("Já se encontra nessa posição")
        else {
            this.x = x
            this.y = y
        }
    }

    fun x(): Int{ return x }
    fun y(): Int{ return y }

    override fun toString(): String{
        return "Posicao | x:$x | y:$y"
    }
}