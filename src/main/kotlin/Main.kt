

fun main() {

    println(WHITE_BOLD_BRIGHT + "Esta aplicación te permite hace una serie de cálculos a partir de un número." + RESET)
    println(WHITE_BOLD_BRIGHT +  "Por ejemplo, calcula el factorial, doble factorial, lee la cantidad de dígitos, calcula fibonacci, etc..." + RESET)

    val number =  readInt(
        YELLOW_BOLD_BRIGHT + "Para comenzar, ingrese un número entero:" + RESET,
        WHITE_BRIGHT + "Por favor, ingrese un valor válido de tipo entero." + RESET
    )

    println()

    println(BLUE_BOLD_BRIGHT + "El factorial de $number es:" + RESET)
    println(BLUE + factorial(number) + RESET)

    println()

    println(BLUE_BRIGHT + "El doble factorial de $number es:" + RESET)
    println(BLUE + doblefactorial(number))

    println()

    println(BLUE_BOLD_BRIGHT + "El número de dígitos de $number es:" + RESET)
    println(BLUE + qdigits(number))

    println()

    println(BLUE_BOLD_BRIGHT + "El número invertido es:" + RESET)
    println(BLUE + invertir(number))

    println()

    println(BLUE_BOLD_BRIGHT + "¿Es un número creciente?" + RESET)

    if (creciente(number)){
        println(GREEN_BRIGHT + "Sí" + RESET)
    } else {
        println(RED_BRIGHT + "No" + RESET)
    }

    println()

    println(BLUE_BOLD_BRIGHT + "La reducción a un dígito da el resultado:" + RESET)
    println(BLUE + reduccion(number) + RESET)

    println()

    println(BLUE_BOLD_BRIGHT +"¿Es un primo perfecto?"+ RESET)
    if (primos_perfectos(number)){
        println(GREEN_BRIGHT + "Sí" + RESET)
    } else {
        println(RED_BRIGHT + "No" + RESET)
    }

    println()

    println(BLUE_BOLD_BRIGHT + "Fibonacci:" + RESET)
    println(BLUE + fibonacci(number.toBigInteger()))

}
