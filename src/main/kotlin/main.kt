fun main(args: Array<String>) {
    val colores = listOf("Azul","Amarillo","Rojo")
    with(colores) {
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }
}
