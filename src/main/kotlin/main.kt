
fun main(args: Array<String>) {

    // Como lanzar una excepción
    // throw IllegalStateException("Error!")


    // Controlando las excepciones
    try {
        throw IllegalStateException("Error!")
    } catch (e: Exception){
        println("Ha ocurrido un error")
    } finally{
        println("Ejecutando código final...")
    }

    // Try como expresion
    val primerValor = 10
    val segundoValor = 0
    val resultado: Int = try { primerValor / segundoValor } catch ( e: Exception ) { 0 }
    println(resultado)

}