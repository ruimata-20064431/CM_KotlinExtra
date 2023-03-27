package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*


fun main() {
    val pessoas = mutableListOf<Pessoa>()
    // Create a first person
    pessoas.add(Pessoa("Nome da Pessoa 1", Util.dateFormat("05-12-2006")))


    // output data
    for (pessoa in pessoas) {
        println(pessoa)
        pessoa.comprarVeiculo(Bicicleta("AA-BB-01"))
        if (pessoa.temCarta()) println("Tem carta? : $pessoa.carta")
        pessoa.moverVeiculoPara("AA-BB-01", 1,1)

        pessoa.comprarVeiculo(Carro("BB-AA-99", Motor(135, 1900)))
        pessoa.veiculos.forEach { println(it) }
        pessoa.carta = Carta()
        if (pessoa.temCarta()) println("Tem carta? : $pessoa.carta")
        pessoa.moverVeiculoPara("BB-AA-99", 1,1)
        println("Exige carta? : ${pessoa.veiculos[1].exigeCarta}")
        println("Tem carta?: ${pessoa.temCarta()} || ${pessoa.carta}")


    }

    println("Current date is: ${Util.dateToString(Util.currentDate())}")
    println("Este tem ${Util.dateDiffYears(Util.dateFormat("05-12-2006"), Util.dateFormat("06-01-2016"))}")
}