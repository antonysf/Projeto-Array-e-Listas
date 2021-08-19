package one.digitalinnovation.collections

fun main() {
    val nomes = Array(4) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "zazá"
    nomes[3] = "José"

    for (nome in nomes){
        println(nome)
    }

    println("---------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("---------------------")
    val nomes2 = arrayOf("Maria", "zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}
