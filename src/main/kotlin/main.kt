fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").also {
        lista -> println("El valor original de la lista es $lista")
    }.asReversed()
    println(moviles)
}