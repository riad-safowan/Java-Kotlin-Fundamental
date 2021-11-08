package com.riadsafowan.test.function

import java.util.*
import kotlin.concurrent.thread

var fn: ((text: String) -> Unit)? = null

fun f1(num: Int, function: (n: Int) -> Unit, num2: Int) {

    thread {
        Thread.sleep(1000)
        function(num + num2)
    }

    fn?.invoke("hello world")
}

fun main() {
    fn = {
        println(it)
    }

    f1(2323, {
        println(it)
    }, 234)


    val fff : () -> Int = {
        println("hello")
        34
    }

    getTData(fff)

}

open class xxx<out T> {
    data class yyy<out T>(val value: T) : xxx<T>()
}

fun <T> getTData(
    fun1: () -> T
): xxx<T> {
    return xxx.yyy(fun1.invoke())
}