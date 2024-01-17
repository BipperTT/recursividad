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
