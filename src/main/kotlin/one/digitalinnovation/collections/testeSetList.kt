package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")
    val maria = funcionario("Maria", 1500.0, "PJ")
    val pedro = funcionario("Pedro", 5000.0, "CLT")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("********************************")
    val funcionarios3 = setOf(joao,pedro,maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("********************************")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it) }

}


