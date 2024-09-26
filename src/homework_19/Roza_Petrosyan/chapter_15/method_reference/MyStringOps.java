package homework_19.Roza_Petrosyan.chapter_15.method_reference;

public class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    };
}
