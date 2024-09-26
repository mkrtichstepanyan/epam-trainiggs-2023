package homework_19.Roza_Petrosyan.chapter_15.method_reference_to_an_instance_method;
public class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda add power to Java";
        String outStr;
        MyStringOps strOps = new MyStringOps();
        outStr = stringOp(strOps::strReverse,inStr);

        System.out.println("Original string " + inStr);
        System.out.println("String reversed " + outStr);
    }
}
