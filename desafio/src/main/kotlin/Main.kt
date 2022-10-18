import datasources.ConteudoEducacional
import datasources.Formacao
import datasources.Nivel
import datasources.Usuario

fun main() {

    val conteudo = ConteudoEducacional(nome="Introdução ao Kotlin",duracao=30, nivel = Nivel.BASICO)
    val formacao = Formacao(nome="Kotlin", conteudos = mutableListOf(conteudo), nivel = Nivel.BASICO)
    val usuario = Usuario("João")

    formacao.matricular(usuario)
    println(usuario)
    println(formacao)

}
