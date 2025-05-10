package Blatt5.ex1;

import Blatt5.ex2.InvalidShippingInfoException;

public class ShippingInfo {
    private String country;
    private String city;
    private int zip;

    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        if (city == null || city.trim().isEmpty()) {
            throw new InvalidShippingInfoException("City name cannot be empty.");
        }
        if (zip < 0) {
            throw new InvalidShippingInfoException("Zip code must be positive.");
        }

        this.country = country;
        this.city = city;
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
