package generics;

public class GenericsJava {
    public static void main(String[] args) {
        Dog dog = new Dog("tommy", "alsdkf");
        Mammal mammal = new Mammal("mammal", "sljgs");
        Animal animal = new Animal("animal");

        GenericJ<Animal> generic = new GenericJ<>();
        generic.function(animal);
        generic.function(mammal);
        generic.function(dog);

        GenericJ<Mammal> generic2 = new GenericJ<>();
        generic2.function((Mammal) animal);
        generic2.function(mammal);
        generic2.function(dog);

        GenericJ<Dog> generic3 = new GenericJ<>();
        generic3.function((Dog) animal); //cast is mandatory, smart cast is not allowed
        generic3.function((Dog) mammal);
        generic3.function(dog);
    }
}

class GenericJ<T> {
    void function(T t) {
        System.out.println(t);
    }
}
