package generics

open class Animal(name: String)

open class Mammal(name1: String, name2: String) : Animal(name2)

class Dog(name1: String, name2: String) : Mammal(name2, name1)

class Generic<T> {
    fun function(t: T) {
        println(t)
    }
}

class Covariant<out T> {
    fun asdf(t: Contravariant<T>): Covariant<T> {
        return Covariant()
    }
}

class Contravariant<in T> {
    fun asdf(t: Covariant<T>): Contravariant<T> {
        return Contravariant()
    }
}

fun co(co: Covariant<Animal>) {

}

fun contra(co: Contravariant<Dog>) {

}

fun main() {
    val dog = Dog("tommy", "alsdkf")
    val mammal = Mammal("mammal", "sljgs")
    val animal = Animal("animal")

    val generic = Generic<Animal>()
    generic.function(animal)
    generic.function(mammal)
    generic.function(dog)

    val generic2 = Generic<Mammal>()
    generic2.function(animal as Mammal)
    generic2.function(mammal)
    generic2.function(dog)

    val generic3 = Generic<Dog>()
    generic3.function(animal as Dog) //cast is mandatory, smart cast is not allowed
    generic3.function(mammal as Dog)
    generic3.function(dog)

    //covariant can take all the subclasses
    co(Covariant<Animal>())
    co(Covariant<Mammal>())
    co(Covariant<Dog>())
    co(Covariant<Nothing>())

    //contravariant can take all the superclasses
    contra(Contravariant<Animal>())
    contra(Contravariant<Mammal>())
    contra(Contravariant<Dog>())
    contra(Contravariant<Any>())


}
