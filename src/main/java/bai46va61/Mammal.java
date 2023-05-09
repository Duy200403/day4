package bai46va61;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return super.toString() + " - Mammal";
    }

    @Override
    public void greets() {

    }
}
