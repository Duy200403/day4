package bai46va61;

//public class Cat extends Mammal{
//    public Cat(String name) {
//        super(name);
//    }
//    @Override
//    public void greets() {
//        System.out.println("Meow");
//    }
//}
public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Cat " + getName() + " Meow");
    }

    public String toString() {
        return super.toString() + getName() + " - Cat";
    }
}

