package com.huaranga.dayana.laboratoriocalificado01

// Clase en donde vamos a desarrollar nuestro ejercicio de anagramas planteado por el profesor
class Ejercicio01Kotlin {

    // Función que va a verificar si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Aquí vamos a comprobar si dos palabras tienen la misma loongitud :)
        if (palabra1.length != palabra2.length) {
            return false // Si NO son del mismo tamaño, NO pueden ser anagramas
        }

        // Convertir las palabras a listas de caracteres y ordenarlas
        val palabra1Ordenada = palabra1.toCharArray().sorted()
        val palabra2Ordenada = palabra2.toCharArray().sorted()

        // Comparamos si ambas listas de caracteres son iguales
        return palabra1Ordenada == palabra2Ordenada
    }
}

// Función principal para ejecutar pruebas
fun main() {
    val ejercicio = Ejercicio01Kotlin()

    // Prueba con palabras que son anagramas
    println(ejercicio.sonAnagramas("listen", "silent")) // True

    // Prueba con palabras que no son anagramas
    println(ejercicio.sonAnagramas("hello", "world")) // False
}
