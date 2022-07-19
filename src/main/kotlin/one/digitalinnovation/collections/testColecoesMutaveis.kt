package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João", 2000.0, "CLT")
    val maria = funcionario("Maria", 1500.0, "PJ")
    val pedro = funcionario("Pedro", 5000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("**************************")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("**************************")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("************SET************")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{ println(it) }

    println("************SET************")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{ println(it) }

    println("************SET************")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{ println(it) }
}