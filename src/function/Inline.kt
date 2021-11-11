package function

import java.util.*

//fun doSomething() {
//    println("doSomething start")
//    doSomethingElse()
//    println("doSomething end")
//}
//
// fun doSomethingElse() {
//    println("doSomethingElse")
//}

fun doSomething() {
    println("doSomething start")
    doSomethingElse {
        println("doSomethingElse")
        return@doSomethingElse
    }
    println("doSomething end")
}

fun doSomethingElse(abc: () -> Unit) {
    // I can take function
    // do something else here
    // execute the function
    abc()
}

fun main() {
    val time1 = Calendar.getInstance().timeInMillis
   for (i in 1..5000) doSomething()
    val time2 = Calendar.getInstance().timeInMillis
    println(time2-time1)
}


// https://blog.mindorks.com/understanding-inline-noinline-and-crossinline-in-kotlin