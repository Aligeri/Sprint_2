package model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegeterian;

    public Food(int amount, double price, boolean isVegeterian){
        this.amount = amount;
        this.price = price;
        this.isVegeterian = isVegeterian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsVegeterian() {
        return isVegeterian;
    }
}
