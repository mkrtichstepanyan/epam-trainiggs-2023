package homework_7.Varsik_Pijoyan;

public class PhoneNumberException extends Exception{
    @Override
    public String toString() {
        return "Please enter the correct format of phone number.";
    }
}
