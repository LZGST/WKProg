package Blatt4.prasenz.ex2;

public class Truck extends Vehicle implements Refuelable{
    private double fuelLevel;
    Truck(double fuelLevel){
        setId("Truck");
        setMaxLoad(10000);
        setFuelLevel(fuelLevel);
    }

    @Override
    public void refuel(double liters) {

    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    double getRange() {
        return 0;
    }

    @Override
    double fuelNeeded(double distance) {
        return 0;
    }


}
