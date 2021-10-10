package exercises.technology;

public class Computer extends AbstractEntity {

    private int processorSpeed;
    private boolean hasGraphicscard;
    private int ramSize;

    public Computer(int processorSpeed, boolean hasGraphicscard, int ramSize) {
        super();
        this.processorSpeed = processorSpeed;
        this.hasGraphicscard = hasGraphicscard;
        this.ramSize = ramSize;
    }
    public void increasePS (int n) {
        this.processorSpeed = this.processorSpeed + n;
    }

    public void increaseRAM (int x) {
        this.ramSize = this.ramSize + x;
    }
}
