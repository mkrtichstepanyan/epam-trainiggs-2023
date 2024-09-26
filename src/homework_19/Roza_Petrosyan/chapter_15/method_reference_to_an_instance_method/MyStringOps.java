package homework_19.Roza_Petrosyan.chapter_15.method_reference_to_an_instance_method;

public class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
