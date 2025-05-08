package Blatt4.ex1;

public class Milk extends PopularGrocery{
    Milk(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        setDiscountThreshold(discountThreshold);
        setHouseholdLimit(20);
    }

    @Override
    int getBulkDiscount() {
        if(getQuantity() > getDiscountThreshold()){
            return 12;
        }
        return 0;
    }

}
