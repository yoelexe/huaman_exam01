
fun main() {

    print("Ingresar un número: ")
    val number : Int = readln().toInt()

    if (number % 2 == 0)
        println("El número es $number par")
    else
        println("El número es $number impar")
}