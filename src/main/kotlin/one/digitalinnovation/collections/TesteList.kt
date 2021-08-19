package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("joao", 1000.0 )
    val pedro = Funcionario("pedro", 2000.0 )
    val maria = Funcionario("maria", 4000.0 )

    val funcionarios =  listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("-----------------------------------------")
    println(funcionarios.find { it.nome == "maria" })

}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome:    $nome
            salario: $salario
        """.trimIndent()

}