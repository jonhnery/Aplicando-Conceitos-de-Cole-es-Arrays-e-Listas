package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João",2000.0)
    val maria = funcionario("Maria",1500.0)
    val pedro = funcionario("Pedro",5000.0)

    val funcionarios = listOf(joao,maria,pedro)

    funcionarios.forEach{ println(it) }

    println("********************************")
    println(funcionarios.find { it.nome == "Maria"})

    println("********************************")
    funcionarios.sortedBy { it.salario }.forEach{ println(it) }
}

data class funcionario(
    val nome:String,
    val salario:Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            
        """.trimIndent()

}
