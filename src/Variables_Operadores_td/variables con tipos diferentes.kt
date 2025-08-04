package Variables_Operadores_td

fun main(args: Array<String>) {
    var a: Float = 10.5f
    var b: Int = 5
    var resultado: Int

    //Esto no funciona
    //print("Suma: ")
    //resultado =  a + b

    //Esto sí
    print("Suma: ")
    resultado =  a.toInt() + b  //convierte el valor de a, que es un Float, a un Int.

    print(resultado)
}