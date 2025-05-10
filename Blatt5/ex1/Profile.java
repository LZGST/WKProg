package Blatt5.ex1;

import Blatt5.ex2.MissingShippingInfoException;

public class Profile {
    ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo)throws MissingShippingInfoException {
        if (shippingInfo == null) {
            throw new MissingShippingInfoException("Shipping information is missing.");
        }
        this.shippingInfo = shippingInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
