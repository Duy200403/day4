package bai46va61;

//public class Dog extends Mammal{
//    public Dog(String name) {
//        super(name);
//    }
//
//    @Override
//    public void greets() {
//        System.out.println("woof");
//    }
//}
public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Dog: " + getName() + " Woof.");
    }

    public void greets(Dog another) {
        System.out.println("Dog: " + getName() + " Wooooofff " /*+ another.getName() + "."*/);
    }

    public String toString() {
        return super.toString() + " - Dog";
    }
}
