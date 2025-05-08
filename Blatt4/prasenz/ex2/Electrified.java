package Blatt4.prasenz.ex2;

public interface Electrified {
    double MAX_BATTERY_KWH = 120;
    void charge(double kWh);
    double getBatteryLevel();
}
