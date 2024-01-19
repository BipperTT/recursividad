import java.math.BigInteger

fun factorial(n: Int): Long {

    if (n == 0 || n == 1) {
        print(BLUE + "1 = " + RESET)
        return 1
    } else {
        print(BLUE + "$n x " + RESET)
        return n.toLong() * factorial(n - 1)
    }

}

fun doblefactorial(n: Int): Long {

    if (n == 0 || n == 1) {
        print(BLUE + "1 = " + RESET)
        return  1
    } else {
        print(BLUE + "$n x " + RESET)
        return n.toLong() *  doblefactorial(n - 2)
    }

}

fun qdigits(n: Int): Int {

    return if(n/10 == 0) {
        1
    } else {
        1+qdigits((n/10))
    }

}

fun invertir(n: Int): Int {

    return if (n < 10) {
        n
    } else {
        print(BLUE + n%10 + RESET)
        invertir(n/10)
    }

}

fun fibonacci(n: BigInteger): BigInteger {

    return if (n <= 1.toBigInteger()) {
        n
    } else {
        fibonacci(n - 1.toBigInteger()) + fibonacci(n - 2.toBigInteger())
    }

}

fun creciente(n: Int): Boolean {

    val d_actual = n.toString()[0]
    val num_rest = n.toString()
    val resto_num = num_rest.substring(1)

    return if (n/10==0) {
        true
    } else if (d_actual < resto_num[0]) {
        creciente(resto_num.toInt())
    } else {
        false
    }

}

fun reduccion(n: Int): Int {

    var suma = 0
    var numero_restante = n

    while (numero_restante != 0) {
        suma += numero_restante % 10
        numero_restante /= 10
    }

    return if (suma/10 == 0) {
        suma
    } else {
        reduccion(suma)
    }

}

fun primos_perfectos(n: Int): Boolean {

    var suma = 0
    var numero_restante = n
    var es_primo = 0

    while (numero_restante != 0) {
        suma += numero_restante % 10
        numero_restante /= 10
    }

    if (suma / 10 == 0) {
        suma
    } else {
        primos_perfectos(suma)
    }

    if (suma <= 1) {
        es_primo ++
    }

    for (i in 2 until suma) {
        if (suma % i == 0) {
            es_primo ++
        }
    }

    if (es_primo == 0){
        return true
    }else{
        return false
    }

}