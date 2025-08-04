package concatenacion

fun main (){
    val introduction = "El resultado de"
    val plus = "más"
    val firstNumber = 2
    val secondNumber = 5

    println("$introduction $firstNumber $plus $secondNumber es: ${firstNumber + secondNumber}")

    val numberOfPhotos = 100
    val photosDeleted = 10

    println("$numberOfPhotos photos")
    println("$photosDeleted photos eliminadas")
    println("${numberOfPhotos - photosDeleted} photos despues")

    //concatenacion de string y int
    var contadorMensajes: Int = 10
    println("tienes $contadorMensajes nuevos mensajes.")
    //agregar datos v = v +
    //contadorMensajes = contadorMensajes + 1 || contadorMensajes++
    contadorMensajes++
    println("tienes $contadorMensajes nuevos mensajes.")
    //para restar:
    contadorMensajes--
    println("tienes $contadorMensajes nuevos mensajes.")
}