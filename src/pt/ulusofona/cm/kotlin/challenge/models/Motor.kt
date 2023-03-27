package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

/*
class Motor (
    var cavalos    : Int,
    var cilindrada : Int,
    ): Ligavel {

    override var ligado : Boolean
        set(value){
            var a = value
            if (a == a) a
            //does nothing --> issues with private vs interface property of primary type
             }
        get(){ return estaLigado()}

    fun ligado(): Boolean   { return estaLigado() }

    override fun toString (): String{
        return "Motor | $cavalos | $cilindrada | $ligado"
    }
}

 */

class Motor (
    var cavalos     : Int,
    var cilindrada  : Int
): Ligavel{

    override var ligado      : Boolean = false


    //fun estaLigado(): Boolean   { return ligado }

    override fun toString (): String{
        return "Motor | $cavalos | $cilindrada"
    }
}