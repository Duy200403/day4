package bai46va61;

public class main {
    public static void main(String[] args) {
//    Animal[] animals = new Animal[4];
//    animals[0] = new Cat();
//    animals[1] = new Dog();
//    animals[2] = new Dog();
//    animals[3] = new Cat();
        Animal animal = new Animal("Animal") {
            @Override
            public void greets() {

            }
        };
        System.out.println(animal.toString()); // Name: Animal

        Mammal mammal = new Mammal("Mammal:");
        System.out.println(mammal.toString()); // Name: Mammal - Mammal


//        for (Animal animal : animals) {
//        animal.greets();
//    }
        Dog dog1 = new Dog("Dog 1");
        Dog dog2 = new Dog("Dog 2");

        dog1.greets(); // Dog Dog 1 greets you.
        dog1.greets(dog2); // Dog Dog 1 greets Dog Dog 2.
        System.out.println(dog1.toString()); // Name: Dog 1 - Mammal - Dog
        Cat cat1 = new Cat("Cat 1");

        cat1.greets(); // Cat Cat 1 greets you.
        System.out.println(cat1.toString()); // Name: Cat 1 - Mammal - Cat

    }
}
