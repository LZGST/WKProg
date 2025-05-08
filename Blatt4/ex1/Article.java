package Blatt4.ex1;

public abstract class Article {
    private int discountThreshold;
    private int householdLimit;

    abstract int getBulkDiscount();
    abstract boolean showWarning();

    public int getDiscountThreshold() {
        return discountThreshold;
    }

    public void setDiscountThreshold(int discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

    public int getHouseholdLimit() {
        return householdLimit;
    }

    public void setHouseholdLimit(int householdLimit) {
        this.householdLimit = householdLimit;
    }
}
