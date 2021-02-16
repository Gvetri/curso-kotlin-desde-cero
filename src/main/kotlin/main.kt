
fun main(args: Array<String>) {

    //Creando un set inmutable
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vocalesRepetidas) // Resultado: [a, e, i, o, u]

    //Creando set mutables
    val numerosFavoritos = mutableSetOf(1,2,3,4)
    numerosFavoritos.add(5)
    println(numerosFavoritos) // Resultado: [1, 2, 3, 4, 5]

    //Eliminado elementos de set
    numerosFavoritos.remove(3)
    println(numerosFavoritos) // Resultado: [1, 2, 4, 5]

    //Eliminar dependiendo de una condición
    numerosFavoritos.removeIf { numero -> numero.rem(2) != 0 }
    println(numerosFavoritos)
}