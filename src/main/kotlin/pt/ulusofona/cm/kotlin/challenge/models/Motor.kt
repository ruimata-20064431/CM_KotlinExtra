package pt.ulusofona.cm.kotlin.challenge.models
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor (
    private var _cavalos    : Int               ,
    private var _cilindrada : Int               ,
    ): Ligavel {

    override var _ligado : Boolean
        set(value){
            var a = value
            if (a == a) a
            //does nothing --> issues with private vs interface property of primary type
             }
        get(){ return estaLigado()}

    fun ligado(): Boolean   { return estaLigado() }

    override fun toString (): String{
        return "Motor | $_cavalos | $_cilindrada | $_ligado"
    }
}