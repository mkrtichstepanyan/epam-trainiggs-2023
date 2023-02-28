package homework_8.robert_nazaryan.mypackage;

public class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.print("---> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
