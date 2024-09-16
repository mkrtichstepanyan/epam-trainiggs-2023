package homework_7_galust_arzumanyan;


public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Phone Number: " + order.getCustomer().getPhoneNumber());

        printDelimiter();
        order.printOrderAttributes();
        System.out.println("Total amount : " + order.calculateOrderPrice() + " dram");
        trainlingLine();
    }


    private static void leadingLine() {
        System.out.println("#######################");
    }

    private static void printDelimiter() {
        System.out.println("***********************");
    }

    private static void trainlingLine() {
        System.out.println("#######################");
    }
}
