package Blatt4.ex3;

public class Lamp implements Switchable, Dimmable {
    private boolean on;
    private int brightness;

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean isOn() {
        if (on){
            return on;
        }
        return false;
    }

    @Override
    public void setBrightness(int level) {
        if (level < 0 && isOn()) {
            brightness = 0;
        } else if (level > MAX_BRIGHTNESS && isOn()) {
            brightness = MAX_BRIGHTNESS;
        } else if (isOn()) {
            brightness = level;
        } else {
            // Do nothing if the lamp is off
            System.out.println("Lamp is off. Cannot set brightness.");
        }
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    public void dimToHalf() {
        Dimmable.super.dimToHalf();
    }
}
