package com.example.ejerciciost2


//Ejercicio1

val edad : Int = 19
val nombre : String = "Jorge"
val altura : Double = 1.80




const val pi: Double = 3.14159
val radio: Double = 2.0



fun ej2(pi: Double, radio: Double): Double {
    return pi*(radio*radio)

}

fun saludar(nombre: String, edad: Int): String {
    val mensaje= "Hola soy $nombre y mi edad es $edad"
    return mensaje
}

fun informacionPersonal(nombre: String, edad: Int, ciudad: String): String{
    val mensaje = "Hola soy $nombre, tengo $edad años y vivo en $ciudad"
    return mensaje
}


fun fahrenheitCelsius(fahrenheit: Double, celsius: Double = (fahrenheit-32)*5/9): String{
    val mensaje = "$fahrenheit grados fahrenheit son $celsius grados celsius"
    return mensaje
}

fun celsiusFahrenheit(celsius:Double, fahrenheit: Double = (celsius*9/5)+32):String {
    val mensaje = "$celsius grados celsius son $fahrenheit grados fahrenheit"
    return mensaje
}
fun main() {
    //ej2

    val area = ej2(pi, radio)
    println("El área del círculo es: $area")

    //ej3
    println(saludar("Jorge" , 19))

    //ej4
    println(informacionPersonal("Jorge", 19, "Granada"))

    //ej5
    println(fahrenheitCelsius(90.0))
    println(celsiusFahrenheit(20.0))
}