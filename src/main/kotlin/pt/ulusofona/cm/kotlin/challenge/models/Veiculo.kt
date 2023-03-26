package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Veiculo (
    private var _identificador      : String    ) {

    private var _posicao            : Posicao = Posicao(-1, -1)
    private var _dataDeAquisicao    : Date      = Date("01/01/1900")
    private var _exigeCarta         : Boolean   = true

    fun requerCarta(): Boolean{
        return _exigeCarta
    }

    fun movePara(x: Int, y: Int){
        _posicao.alterarPosicaoPara(x, y)
    }

    fun registaAquisicao(data: Date){
        this._dataDeAquisicao = data
    }

    override fun toString(): String{
        return "Veiculo | $_identificador | $_posicao | $_dataDeAquisicao"
    }
}