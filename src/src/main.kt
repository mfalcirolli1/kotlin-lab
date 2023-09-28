import Classes.Dog
import Classes.Human

fun main(){

    val nome = "Matheus"
    val human = Human()
    human.name = nome

    val dog = Dog("Pitbull")
    dog.owner = human
    dog.name = "Linux"

    println(dog.country)
    println("Olá, $nome e ${dog.name}!")

    dog.sayHi1()
    dog.sayHi2("Matheus")
}