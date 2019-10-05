package vehicle;

public class Vehicle {
    protected int maxSpeed;
    protected int currentSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void increaseSpeed() {
        currentSpeed++;
        if (currentSpeed > maxSpeed) {
            throw new VehicleCrashedException();
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public class VehicleCrashedException extends RuntimeException {
        public VehicleCrashedException() {
            super();
        }

        public VehicleCrashedException(String message) {
            super(message);
        }
    }
}
