
//private const val PI : Double = 3.1416

internal const val PI : Double = 3.1416


fun main(args: Array<String>) {

    var dinero : Int = 10
    println(dinero)
    dinero = 5
    println(dinero)

    // Variable de solo lectura

    val nombre : String = "Maria"
    println(nombre)

// Esto daria error :
// nombre = "Rose"

    val boolean : Boolean = true
    val numeroLargo : Long = 30000000000000000
    val double : Double = 2.7182
    val float : Float = 1.1f

    val primerValor = 20
    val segundoValor = 10
//    val tercerValor = primerValor.minus(segundoValor)
    val tercerValor = primerValor - segundoValor

    println(tercerValor)

}