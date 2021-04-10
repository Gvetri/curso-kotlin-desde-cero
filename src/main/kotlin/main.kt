fun main(args: Array<String>) {
    var nombre: String? = null
    nombre?.let { valor ->
        println("El nombre no es nulo, es $valor")
    }
    nombre = "Giuseppe"
    nombre?.let { valor ->
        println("El nombre no es nulo, es $valor")
    }
}
