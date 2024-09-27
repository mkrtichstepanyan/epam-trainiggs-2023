package homework_5.Galust_Arzumanyan.pizza;

public class User {
    private int UserId;

    User() {
        this.UserId = (int) Math.floor(Math.random() * 10000) + 1;
    }

    public int getCustomerNumber() {
        return UserId;
    }
}
