package Blatt5.ex1;

import Blatt5.ex2.InvalidCustomerException;

public class Customer {
    private int id;
    private Profile profile;

    public Customer(Profile profile, int id) throws InvalidCustomerException {
        if (id < 0) {
            throw new InvalidCustomerException("Customer ID must be non-negative.");
        }
        if (profile == null) {
            throw new InvalidCustomerException("Customer profile is missing.");
        }
        this.id = id;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
