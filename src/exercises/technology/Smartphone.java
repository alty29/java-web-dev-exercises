package exercises.technology;

public class Smartphone extends Computer {
    private int numberofSelfies;

    public Smartphone(int processorSpeed, int ramSize, int numberofSelfies) {
        super (processorSpeed, ramSize);
        this.numberofSelfies = numberofSelfies
    }
    public void takeSelfies() {
        this.numberofSelfies = this.numberofSelfies + 1;
    }
    public int getNumberofSelfies() {
        return this.numberofSelfies;
    }
}
