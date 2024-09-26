package homework_19.Roza_Petrosyan.chapter_15.capturing_local_variable;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLamda = (n) -> {
//            int v = num + n;
//            num++;
//            return  v;
            return n;
        };
    }
}
