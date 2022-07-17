package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in salarios) {
    println(salario)
    }
    println("********************************")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("********************************")
    val salariosfiltro = salarios.filter { it < 2500.0 } //filtrar valores
    salariosfiltro.forEach{ println(it) }

    println("********************************")
    println(salarios.count{ it in 2000.0..5000.0}) //contar valores

    println("********************************")
    println(salarios.find{ it == 2250.0}) //buscar valor
    println(salarios.find{ it == 500.0}) //buscar valor

    println("********************************")
    println(salarios.any{ it == 1000.0}) //buscar qualquer valor resposta booleana
    println(salarios.any{ it == 100.0}) //buscar qualquer valor resposta booleana


}