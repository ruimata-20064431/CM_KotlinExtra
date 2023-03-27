package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import java.util.*

open class Veiculo: DateFormat {

    protected var _identificador     : String
    protected var _posicao           : Posicao
    protected var _dataDeAquisicao   : Date
    protected var _exigeCarta        : Boolean = true

    constructor (identificador: String    ){
        _identificador = identificador
        _posicao = Posicao(0, 0)
        _dataDeAquisicao = currentDate()
        // _exigeCarta  => true by default
    }


    fun requerCarta(): Boolean{
        return _exigeCarta
    }

    fun movePara(x: Int, y: Int){
        _posicao.alterarPosicaoPara(x, y)
    }

    fun registaAquisicao(data: Date){
        this._dataDeAquisicao = data
    }

    fun lerIdentificador(): String{
        return _identificador
    }

}