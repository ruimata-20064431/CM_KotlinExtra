package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import java.util.*

open class Veiculo: DateFormat {

    var identificador           : String
    var posicao                 : Posicao
    var dataDeAquisicao         : Date
    var exigeCarta              : Boolean = true

    constructor (identificador: String    ){
        this.identificador      = identificador
        this.posicao            = Posicao(0, 0)
        this.dataDeAquisicao    = currentDate()
    }


    fun requerCarta(): Boolean{
        return exigeCarta
    }

    fun movePara(x: Int, y: Int){
        posicao.alterarPosicaoPara(x, y)
    }

    fun registaAquisicao(data: Date){
        this.dataDeAquisicao = data
    }

    fun lerIdentificador(): String{
        return identificador
    }

}