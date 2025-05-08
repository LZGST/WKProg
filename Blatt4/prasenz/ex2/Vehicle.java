package Blatt4.prasenz.ex2;

public abstract class Vehicle {
    private String id;
    private double maxLoad;

    abstract double getRange();

    abstract double fuelNeeded(double distance);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
}
