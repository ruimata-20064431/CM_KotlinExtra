package pt.ulusofona.cm.kotlin.challenge.interfaces

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException

interface Ligavel {

    var _ligado: Boolean
    fun ligar()        {
        if (estaLigado()) throw VeiculoLigadoException("O veiculo já se encontra ligado")
        _ligado = true    }

    fun desligar(){
        if (!estaLigado()) throw VeiculoDesligadoException("O veiculo já se encontra desligado")
        _ligado = false   }

    fun estaLigado(): Boolean {
        return _ligado
    }
}