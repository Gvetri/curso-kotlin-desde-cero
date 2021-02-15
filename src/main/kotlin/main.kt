
fun main(args: Array<String>) {

    val nombreColor = "Amarillo"

    when (nombreColor) {
        "Amarillo" -> println("El amarillo es el color de la alegria")
        "Rojo" -> println("El rojo simboliza el calor")
    }

    // Combinado con else
    when (nombreColor) {
        "Amarillo" -> println("El amarillo es el color de la alegria")
        "Rojo" -> println("El rojo simboliza el calor")
        else -> {
            println("No tengo información de ese color")
        }
    }

    // Ejecutando el mismo codigo para dos elementos
    when (nombreColor) {
        "Amarillo" -> println("El amarillo es el color de la alegria")
        "Rojo","Carmesi" -> println("El rojo simboliza el calor")
        else -> {
            println("No tengo información de ese color")
        }
    }

    //Comparación de rangos
    val httpCode = 200
    when (httpCode) {
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido, algo ha fallado")
    }

    //Asignación
    val tallaDeZapatos = 41
    val mensaje = when (tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,44-> "Apurate casi no nos quedan!"
        45 -> "Lo siento no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41,42,43,44,45"
    }
}