package Blatt4.ex3;

public interface Dimmable {
    // alle attribute deklariert in interfaces sind public static final
    int MAX_BRIGHTNESS = 100;
    void setBrightness(int level); //ensure the brightness level stays between 0 and MAX_BRIGHTNESS
    int getBrightness(); //returns the current brightness level
    default void dimToHalf() {
        setBrightness(MAX_BRIGHTNESS / 2);
    } //sets the brightness to half of the maximum brightness level
}
