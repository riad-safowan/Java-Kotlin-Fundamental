package inheritance

open class Animal {
    companion object {
        val isLive: Boolean = true
        fun sleep() {
        }
    }

    open fun sayName() {
    }
}

interface Caller {
    fun call(text: String)
    fun sayName() {}
}

class Dog : Animal(), Caller {
    override fun sayName() {
        super<Caller>.sayName()
        super<Animal>.sayName()

        Animal.sleep()
    }

    override fun call(text: String) {

    }
}

class Person {
    init {
        Animal.sleep()
    }
}

//lamda
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }

fun main() {
    println("Is 7 even? - ${isEven.accept(7)}")
    //another
    val isOdd = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 1
        }
    }
    println("is 7 Odd? - ${isOdd.accept(7)}")
}

