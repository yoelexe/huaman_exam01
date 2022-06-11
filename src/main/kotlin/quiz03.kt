import kotlin.math.*
fun main() {

    println(" # Calcular la longitud y área del circulo")
    println("Ingresar valor del radio (r) ")
    val radio : Int = readln().toInt()
    val circu = "${radio * 2 * PI}"
    println("El valor de la longitud de la circunferencia es $circu")
    val area = "${radio * radio * PI}"
    println("El valor del área del circulo es igual a $area")
}