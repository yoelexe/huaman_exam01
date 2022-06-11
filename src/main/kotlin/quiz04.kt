
fun main(){

    println(" Características de un automóvil ")


    val car = quiz04_car();
    car.details();
    println("Nombre: ${car.nombre} ")
    println("Potencia: ${car.potencia} kW")
    println("Velocidad Máxima: ${car.velmax} km/h")
    println("Peso: ${car.peso} kg")
    car.order();

}