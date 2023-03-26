package pt.ulusofona.cm.kotlin.challenge.models

class Motor (
    private var _cavalos    : Int               ,
    private var _cilindrada : Int               ,
    ){

    private var _ligado     : Boolean = false

    fun ligarMotor()        { _ligado = true    }
    fun desligarMotor()     { _ligado = false   }
    fun ligado(): Boolean   { return _ligado    }
}