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

    //covariant can take child
    val covariant1 = Covariant<Animal>()
    val covariant2 = Covariant<Mammal>()
    val covariant3 = Covariant<Dog>()
    co(covariant1)
    co(covariant2)
    co(covariant3)

    //contravariant can take parent
    val contravariant1 = Contravariant<Animal>()
    val contravariant2 = Contravariant<Mammal>()
    val contravariant3 = Contravariant<Dog>()
    contra(contravariant1)
    contra(contravariant2)
    contra(contravariant3)

}
