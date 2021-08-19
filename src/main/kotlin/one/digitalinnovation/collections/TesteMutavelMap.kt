package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("joao", 2000.0, "CLT")
    val pedro = Funcionario("pedro", 1500.0, "PJ")
    val maria = Funcionario("maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, joao)
    repositorio.create(maria.nome, joao)

    println(repositorio.findById(joao.nome))
}
