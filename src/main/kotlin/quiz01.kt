
fun main(){

    println("¿Cuál es tu nombre de usuario?")
    val name : String = readln()

    println("¿Cuál es tu habilidad?")
    val habilidad : String = readLine().toString()

    println(" El nombre que ingreso es ${name.uppercase()} y tiene la habilidad de ${habilidad.uppercase()}")
}