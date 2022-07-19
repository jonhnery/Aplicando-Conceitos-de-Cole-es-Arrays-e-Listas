package one.digitalinnovation.collections

fun main() {

    val joao = funcionario("João", 2000.0, "CLT")
    val maria = funcionario("Maria", 1500.0, "PJ")
    val pedro = funcionario("Pedro", 5000.0, "CLT")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findByto(maria.nome))

    println("--------------------------")
    repositorio.findAll().forEach{ println(it) }

}
