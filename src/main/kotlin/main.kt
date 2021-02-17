
fun main(args: Array<String>) {

    // Pasar lambda como parámetro a una función de alto orden
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!", block = {
        valorInicial -> valorInicial.length
    })
    println(largoDelValorInicial)

    val largoDelValorInicial2 = superFuncion(valorInicial = "Hola!") { valorInicial -> valorInicial.length }
    println(largoDelValorInicial2)

    // Como obtener una lambda de una función
    val obtenerLambda = funcionInception("Carlos")

    // Como obtener el valor de una lambda obtenida como resultado de otra función
    val valorDeLambda = obtenerLambda()
    println(valorDeLambda)

    // Como obtener el valor de una lambda declarada como variable

    val lambdaComoVariable : (String) -> String = { mensaje -> "El mensaje es $mensaje" }
    println(lambdaComoVariable)

    val lambdaComoVariable2 = { mensaje : String -> "El mensaje es $mensaje" }
    println(lambdaComoVariable2)

    val valorDeLambdaComoVariable = lambdaComoVariable("La función ha sido llamada con exito")
    println(valorDeLambdaComoVariable)

}

fun superFuncion(valorInicial: String, block : (String) -> Int) : Int {
    return block(valorInicial)
}

// Como devolver una función

fun funcionInception(nombre: String) : () -> String {
    return { "Hola desde la lambda $nombre" }
}