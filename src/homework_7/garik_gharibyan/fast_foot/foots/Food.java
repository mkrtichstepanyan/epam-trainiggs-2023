package homework_7.garik_gharibyan.fast_foot.foots;

public abstract class Food {

    public String name;

    public double price;

    public int quantity;

    public void setName(String name) {
        this.name = name;
    }


    public abstract String getName() ;

    public abstract int getQuantity() ;

    public abstract double getPrice();




}
