package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.Bicicleta
import pt.ulusofona.cm.kotlin.challenge.models.Pessoa
import pt.ulusofona.cm.kotlin.challenge.models.Util


fun main() {
    val pessoas = mutableListOf<Pessoa>()
    // Create a first person
    for (i in 1..5)
        pessoas.add(Pessoa("Nome da Pessoa $i", Util.dateFormat("05-12-2006")))


    // output data
    for (pessoa in pessoas) {
        println(pessoa)
        pessoa.comprarVeiculo(Bicicleta("AA-BB-01"))
        pessoa.veiculos.forEach { println(it) }
        if (pessoa.temCarta()) println("Tem carta? : $pessoa.carta")
    }

    println("Current date is: ${Util.dateToString(Util.currentDate())}")
    println("Este tem ${Util.dateDiffYears(Util.dateFormat("05-12-2006"), Util.dateFormat("06-01-2016"))}")
}