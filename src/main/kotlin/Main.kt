package org.example

import java.lang.Exception

fun numberValidation(): Double{
    try {
        return readln().toDouble()
    } catch (_: Exception){
        print("El valor ingresado no es válido, ingrese un valor válido: ")
        return numberValidation()
    }
}

fun inputNumber(variable: String): Double{
    print("Ingrese el valor para $variable: ")
    return numberValidation()
}

fun interfaceMenu(): Double{
    println("+-+-+-+-+-[CALCULADORA]-+-+-+-+-+")
    println("   1. Suma")
    println("   2. Resta")
    println("   3. Multiplicación")
    println("   4. División")
    println("   0. Salir")
    println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+")
    print(" --> ")
    return numberValidation()
}

fun main() {
    val calculator = Calculator()

    while (true){
        val option = interfaceMenu()

        if(option == 0.0){
            break
        }

        val a = inputNumber("A")
        val b = inputNumber("B")

        when(option){
            1.0 -> println("$a + $b = " + calculator.add(a,b))
            2.0 -> println("$a - $b = " + calculator.subtract(a,b))
            3.0 -> println("$a * $b = " + calculator.multiply(a,b))
            4.0 -> {
                try{
                    println("$a / $b = " + calculator.divide(a,b))
                } catch (e: ArithmeticException){
                    println(e.message)
                }
            }
        }


    }
}