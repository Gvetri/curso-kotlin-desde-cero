
// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main() {
    // Declarar el mensaje de entrada del programa
    println("Hola soy tu bola 8 magica creada en Kotlin. ¿Cual de estas opciones deseas realizar? ")
    println("1. Realizar una pregunta.")
    println("2. Revisar todas las respuestas.")
    println("3. Salir")

    // Obtener el valor del usuario y convertirlo a un entero nullable
    val valorIngresado = readLine()

    // Dependiendo del numero utilizamos el when para realizar una acción.
    when (valorIngresado){
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }

}

//Mostramos un error por pantalla
fun mostrarError() {
    println("Vaya parece que has elegido una opción no valida, intenta de nuevo.")
}

//Mostramos un mensaje de despedida por pantalla
fun salir() {
    println("¡Hasta luego!")
}

//Mostramos un menu para seleccionar una de las opciones al usuario
fun mostrarRespuestas() {
    println("Selecciona una opción")
    println("1. Revisar todas las respuestas")
    println("2. Revisar solo las respuestas afirmativas")
    println("3. Revisar solo las respuestas dudodas")
    println("4. Revisar solo las respuestas negativas")

    val opcionIngresada = readLine()?.toInt()
    when(opcionIngresada){
        1 ->  mostrarRespuestasPorTipo()
        2 -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_AFIRMATIVA)
        3 -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_DUDOSA)
        4 -> mostrarRespuestasPorTipo(tipoDeRespuesta = RESPUESTA_NEGATIVA)
        else -> println("Respuesta no valida, adios.")
    }

}

// Mostramos las respuestas dependiendo del tipo que se pase como parametro
fun mostrarRespuestasPorTipo(tipoDeRespuesta : String = "TODOS") {
    when (tipoDeRespuesta){
        "TODOS" -> respuestas.keys.forEach { respuesta -> println(respuesta) }
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }

        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }
    }
}

// Preguntamos al usuario que deberiamos mostrarle y le mostramos una respuesta al azar
fun realizarPregunta() {
    println("¿Que preguntas deseas realizar?")
    readLine()
    println("Asi que esa es tu pregunta... La respuesta a eso es:")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}
