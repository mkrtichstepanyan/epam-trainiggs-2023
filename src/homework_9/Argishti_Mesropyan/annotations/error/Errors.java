package homework_9.Argishti_Mesropyan.annotations.error;

public class Errors {
    private final Error[] errors = new Error[9];
    private int index = 0;

    public void addError(Error error) {
        errors[index++] = error;
    }

    public Error[] getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        String errors = "";

        for (Error error : this.errors) {
            if (error != null) {

                errors += error.toString();
            }
        }

        return "[" + errors + "]";
    }


}
