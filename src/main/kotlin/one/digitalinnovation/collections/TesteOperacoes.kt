package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in salarios) {
    println(salario)
    }
    println("********************************")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    println("********************************")
    val salariosfiltro = salarios.filter { it < 2500.0 }
    salariosfiltro.forEach{ println(it) }
}