package br.com.falciro

fun main() {

    val test = "On foot"

    if (test == "On foot")
    {
        println("Walk")
    }
    else
    {
        println("N/A")
    }

    when (test)
    {
        "On foot" -> println("Walk")
        "Car" -> println("Drive")
        else -> println("N/A")
    }
}