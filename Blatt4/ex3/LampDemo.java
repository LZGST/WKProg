package Blatt4.ex3;

public class LampDemo {
    public static void main(String [] args) {
        Lamp lamp = new Lamp ();
        // turn on , set brightness , dim to half , print result
        lamp.turnOn ();
        lamp.setBrightness (80);
        System.out.println (" Brightness : " + lamp. getBrightness ());
        lamp.dimToHalf ();
        System.out.println(" Brightness : " + lamp.getBrightness ());
    }

}
