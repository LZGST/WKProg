package Blatt4.ex1;

public class Flour extends PopularGrocery{
    Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        setDiscountThreshold(discountThreshold);
        setHouseholdLimit(15);
        setQuantity(quantity);
    }

    @Override
    int getBulkDiscount() {
        if(getQuantity() > getDiscountThreshold()){
            return 5;
        }
        return 0;
    }
}
