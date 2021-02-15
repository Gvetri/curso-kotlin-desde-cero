
fun main(args: Array<String>) {

    // While
    var counter = 10
    while (counter > 0) {
        println(counter)
        counter--
    }

    // Do while
    do {
        println("Generando Numero Aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)

}