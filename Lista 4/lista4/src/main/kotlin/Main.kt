import kotlin.math.log2

//zad 6
val <T> List<T>.tail: List<T>
    get() = drop(1)
val <T> List<T>.head: T
    get() = first()

fun main(args: Array<String>) {

    //zad1
    //[parameters]) -> [result-type]
    fun zad1(s: String, i: Int): String {
        val zad1_out: (s: String, i: Int) -> String = {s,i -> s.repeat(i)}
        return zad1_out(s,i)
    }

    //zad2
    //https://stackoverflow.com/questions/44773351/what-is-the-it-in-kotlin-lambda-body
    fun zad2(s: String): String {
        //val zad2_helpful: (String) -> String = {s:String -> s + "!"}
        val zad2_out: (String) -> String = {it + "!"}
        return zad2_out(s)
    }

    //zad3
    //Fibonacci
    tailrec fun zad3(n: Int, a: Int = 0, b: Int = 1): Int =
        when (n) {
            0 -> a
            1 -> b
            else -> zad3(n - 1, b, a + b)
        }

    //zad4
    //log2
    fun zad4(i: Int): Int{
        val zad4_out: Int = log2(i.toDouble()).toInt()
        return zad4_out
    }

    //zad5
    //formatowanie
    fun zad5(name: String, n: Int, f: (Int) -> Int): String{
        val zad5_out: (name: String, n: Int, f: (Int) -> Int) -> String = {name,n,f-> name + "(" + n + ") = ${f(n)}"}
        return zad5_out(name, n, f)
    }

    //zad 6 u góry poza funkcja main

    //zad 7
    fun <A> zad7(aa: List<A>, order: (A, A) -> Boolean): Boolean {
        tailrec fun go(x: A, xs: List<A>): Boolean =
            if (xs.isEmpty()) true
            else if (!order(x, xs.head)) false
            else go(xs.head, xs.tail)
        return aa.isEmpty() || go(aa.head, aa.tail)
    }
    //zad 8
    //https://www.techiedelight.com/calculate-sum-of-all-elements-in-an-array-in-kotlin/
    fun zad8(a: Array<Int>): Int{
        //z sum
        //val zad8_out = a.map{it}.filter{it>0}.sum()
        //z reduce
        val zad8_out = a.map{it}.filter{it>0}.reduce{x,y -> x+y}
        return zad8_out
    }

    println("Zad1: ")
    println(zad1("test", 5))
    println()
    println("Zad2: ")
    println(zad2("test"))
    println()
    println("Zad3: ")
    println(zad3(6))
    println()
    println("Zad4: ")
    println(zad4(16))
    println()
    println("Zad5: ")
    println(zad5("zad3", 6, ::zad3))
    println(zad5("zad4", 16, ::zad4))
    println()
    println("Zad6: ")
    println("Tail " + listOf<Int>(-5,-10, -15, 2, 4, 9, 3, 7).tail.toString())
    println("Head " + listOf<Int>(-5,-10, -15, 2, 4, 9, 3, 7).head.toString())
    println()
    println("Zad7: ")
    println("rosnąca" + zad7(listOf<Int>(-15,-10, -5, 2, 3,4,7, 9),{ i: Int, j: Int -> i < j}))
    println("rosnąca" + zad7(listOf<Int>(15,10,5),{ i: Int, j: Int -> i < j}))
    println("malejąca" + zad7(listOf<Int>(-15,-10, -5, 2, 3,4,7, 9),{ i: Int, j: Int -> i > j}))
    println("malejąca" + zad7(listOf<Int>(15,10,5),{ i: Int, j: Int -> i > j}))
    println()
    println("Zad8: ")
    println(zad8(arrayOf(-5,-10, -15, 2, 4, 9, 3, 7)))
    println()
}

