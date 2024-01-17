
fun main() {

    println("Escribe el número con el que quieras hacer la série de calculos:")

    val number = readln().toInt()

    println()

    println("El factorial de $number es:")
    println(factorial(number))

    println()

    println("El doble factorial de $number es:")
    println(doblefactorial(number))

    println()

    println("El número de dígitos de $number es:")
    println(qdigits(number))

    println()

    println("El número invertido es:")
    println(invertir(number))

    println()

    println("Fibonacci:")
    println(fibonacci(number))

}
