package vehicle;

public class Car extends Vehicle {
    private boolean isConvertible = false;
    private double maxSpeed;

    public Car(int maxSpeed, boolean isConvertible) {
        super(maxSpeed);
        this.isConvertible = isConvertible;
    }

    public Car(int maxSpeed) {
        super(maxSpeed);
    }
    public boolean getIsConvertible() {
        return this.isConvertible;
    }
}
