package exercises.technology;

public class Laptop extends Computer {
    private double weight;
    public Laptop(int processorSpeed, boolean hasGraphicsCard, double weight) {
        super (processorSpeed, hasGraphicsCard, weight);
        this.weight = weight;
    }
    public boolean isCool() {
        if (weight < 5.0){
            return true;
        }
        else {
            return false;
        }
    }
}
