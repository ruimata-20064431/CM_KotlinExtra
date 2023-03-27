package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Posicao (override var x: Int, override var y: Int): Movimentavel{

    fun alterarPosicaoPara(x: Int, y: Int){
        moverPara(x, y)
    }

    fun x(): Int{ return x }
    fun y(): Int{ return y }

    override fun toString(): String{
        return "Posicao | x:$x | y:$y"
    }
}