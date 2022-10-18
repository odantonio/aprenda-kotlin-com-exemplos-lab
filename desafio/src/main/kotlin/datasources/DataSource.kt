package datasources

data class Usuario(var userName: String)

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>,val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}