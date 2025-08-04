package concatenacion

fun main (){
    //double:
    val viaje1: Double = 3.20
    val viaje2: Double = 4.10
    val viaje3: Double = 1.72
    val totalViajes: Double = viaje1 + viaje2 + viaje3
    println("$totalViajes este es el total de todos los viajes en doubles.")

    //string:
    val reunion = "La proxima reunion será en : "
    val date = "January 1"
    val recordatorio = reunion + date + " en el trabajo."
    println(recordatorio)

    //barra invertida de escape.
    println("Di \"holaaa\"")

    //boolean:
    val notificacionesHabilitadas: Boolean = false
    println("estan habilitadas las notificaciones? " + notificacionesHabilitadas)
}