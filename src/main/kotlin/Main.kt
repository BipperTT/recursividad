fun factorial(n: Int): Long {

    if (n == 0 || n == 1) {
        print("1 = ")
        return 1
    } else {
        print("$n x ")
        return n.toLong() * factorial(n - 1)

    }

}

fun doblefactorial(n: Int): Long {

    if (n == 0 || n == 1) {
        print("1 = ")
        return  1
    }else{
        print("$n x ")
        return n.toLong() *  doblefactorial(n - 2)
    }

}

fun qdigits(n:Int):Int{

    return if(n/10 == 0){
        1
    }else{
        1+qdigits((n/10))
    }

}

fun invertir(n:Int): Int {

    return if (n < 10){
        n
    }else{
        print(n%10)
        invertir(n/10)
    }

}

fun fibonacci(n: Int): Int{

    return if (n==0){
        0
    }else if (n==1){
        1
    }else{
        fibonacci(n-1) + fibonacci(n-2)
    }

}

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
