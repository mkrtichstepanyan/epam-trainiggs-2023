package homework_7.Anush_Ananyan;


public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) {

        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

        public int getNumber () {
            return customerNumber;
        }

        public String getName () {
            return customerName;
        }
    }
