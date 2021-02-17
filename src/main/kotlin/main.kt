
fun main(args: Array<String>) {

    // Let
    var nombre: String? = null
    nombre?.let { // Esto no se ejecutará
        println("El nombre no es nulo, es $it")
    }
    nombre = "Giuseppe"
    nombre?.let { // Esto se ejecutará
        println("El nombre no es nulo, es $it")
    }

    //With
    val usuario = "giuseppe@platzi.com"
    val mensajeDeInicioSesion = with(usuario) {
        iniciarSesion(this)
        "Bienvenido $this"
    }
    println(mensajeDeInicioSesion)

    //Run
    val moviles = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi A3").run {
        removeIf { movil -> movil.contains("Google") }
        this
    }
    println(moviles)

    //Apply
    val movilesSinGoogle = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi A3").apply{
            removeIf { movil -> movil.contains("Google") }
        }
    println(movilesSinGoogle)

    //Also
    val lista = mutableListOf("Google Pixel 2XL","Google Pixel 4a","Huawei Redmi 9","Xiaomi mi A3")
        .also { lista -> println("Lista original $lista") }
        .asReversed()

    println(lista)

}

fun iniciarSesion(usuario: String){
    println("Iniciando sesión con usuario $usuario")
}