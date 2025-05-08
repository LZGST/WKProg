package Blatt4.ex1;

public abstract class GroceryItem extends Article{
    private boolean isPopular;

    public boolean isPopular() {
        return isPopular;
    }

    public void setPopular(boolean popular) {
        isPopular = popular;
    }
}
