package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo: Movimentavel, DateFormat {

    var identificador           : String
    var posicao                 : Posicao
    var dataDeAquisicao         : Date
    //var exigeCarta              : Boolean = false


    constructor (identificador: String    ){
        this.identificador      = identificador
        this.posicao            = Posicao(0, 0)
        this.dataDeAquisicao    = currentDate()
    }


    abstract fun requerCarta(): Boolean

    fun registaAquisicao(data: Date){
        this.dataDeAquisicao = data
    }

    fun lerIdentificador(): String{
        return identificador
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }

}