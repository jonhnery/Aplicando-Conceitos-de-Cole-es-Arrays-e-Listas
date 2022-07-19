package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João",2000.0,"CLT")
    val maria = funcionario("Maria",1500.0,"PJ")
    val pedro = funcionario("Pedro",5000.0,"CLT")

    val funcionarios = listOf(joao,maria,pedro)

    funcionarios.forEach{ println(it) }

    println("********************************")
    println(funcionarios.find { it.nome == "Maria"})

    println("********************************")
    funcionarios.sortedBy { it.salario }
        .forEach{ println(it) }

    println("********************************")
    funcionarios.groupBy { it.tipocontratacao }
        .forEach{ println(it) }

}

