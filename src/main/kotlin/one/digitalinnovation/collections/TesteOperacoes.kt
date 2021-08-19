package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("-----------------------")
    println("media salario: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter{ it > 25000.0 }
    println("-----------------------")
    salariosMaiorQue2500.forEach { println(it) }

}