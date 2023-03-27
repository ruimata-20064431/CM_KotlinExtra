package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Posicao (override var _x: Int, override var _y: Int): Movimentavel{

    fun alterarPosicaoPara(x: Int, y: Int){
        moverPara(x, y)
    }

    fun x(): Int{ return _x }
    fun y(): Int{ return _y }

    override fun toString(): String{
        return "Posicao | x:$_x | y:$_y"
    }
}