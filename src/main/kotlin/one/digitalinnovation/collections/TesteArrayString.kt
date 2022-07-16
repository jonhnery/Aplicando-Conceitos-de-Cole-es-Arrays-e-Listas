package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Pingo"
    nomes[1] = "Jose"
    nomes[2] = "Emma"

    nomes.sort()
    for (nome in nomes){
        println(nome)
    }

}