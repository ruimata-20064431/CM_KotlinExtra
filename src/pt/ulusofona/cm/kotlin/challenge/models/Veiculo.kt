package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.DateFormat
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open class Veiculo: Movimentavel, DateFormat {

    var identificador           : String
    var posicao                 : Posicao
    var dataDeAquisicao         : Date
    var exigeCarta              : Boolean = false


    override var x: Int
        get()  { return x }
        set(a) { if (a == a) a else a } //...

    override var y: Int
        get() = y
        set(a) { if (a == a) a else a } //...

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