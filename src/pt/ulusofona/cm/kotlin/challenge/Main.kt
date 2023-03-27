package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.models.*


fun main() {
    val pessoas = mutableListOf<Pessoa>()
    // Create a first person

    var pessoa1 = Pessoa("Nome da Pessoa 1", Util.dateFormat("05-12-2006"))
    var pessoa2 = Pessoa("Nome da Pessoa 2", Util.dateFormat("05-5-2006"))

    pessoas.add(pessoa1)
    pessoas.add(pessoa2)


    // output data
    for (pessoa in pessoas) {
        println("\n\n===========================\n$pessoa")
        pessoa.comprarVeiculo(Bicicleta("AA-BB-01"))
        if (pessoa.temCarta()) println("Tem carta? : $pessoa.carta")
        pessoa.moverVeiculoPara("AA-BB-01", 1,1)

        pessoa.comprarVeiculo(Carro("BB-AA-99", Motor(135, 1900)))
        pessoa.veiculos.forEach { println(it) }
        pessoa.carta = Carta()
        if (pessoa.temCarta()) println("Tem carta? : ${pessoa.carta}")
        println("Exige carta? : ${pessoa.veiculos[1].requerCarta()}")
        println("Tem carta?: ${pessoa.temCarta()} || ${pessoa.carta}")


        pessoa.moverVeiculoPara("BB-AA-99", 12,12)
    }

    var pessoa3 = Pessoa("Nome da Pessoa 3", Util.dateFormat("27-3-2006"))

    pessoa2.venderVeiculo("BB-AA-99", pessoa3)
    pessoas.add(pessoa3)


    println("\n\n\n==================================================================\n")
    for (pessoa in pessoas){
        println("Pessoa: $pessoa")
        for (veiculo in pessoa.veiculos){
            println(veiculo)
        }
        println("\n")
    }

    println("Current date is: ${Util.dateToString(Util.currentDate())}")
    println("Este tem ${Util.dateDiffYears(Util.dateFormat("05-12-2006"), Util.dateFormat("06-01-2016"))}")
}