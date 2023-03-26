package pt.ulusofona.cm.kotlin.challenge.models

class Posicao (private var _x:Int,  private var _y: Int){

    fun alterarPosicaoPara(x: Int, y: Int){
        _x = x
        _y = y
    }
}