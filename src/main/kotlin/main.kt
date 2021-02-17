
fun main(args: Array<String>) {
    val letraAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    println(letraAleatoria)
}

private fun String.randomCase(): String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) toUpperCase() else toLowerCase()
}
