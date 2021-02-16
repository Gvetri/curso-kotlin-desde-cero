
fun main(args: Array<String>) {

    val numerosDeLoteria = listOf(11,22,43,56,78,66)

    // Ordenar con Sort
    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosDeLoteria)

    // Ordenar por orden descendiente
    val numerosDeLoteriaDescendiente = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendiente)

    // Ordenar por condición
    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    // Shuffled

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    // Reversa

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    // Convertir lista de un tipo en listas de otro tipo

    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    // Filtrar numeros

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)



}