package homework_9.Vladimir_Vanyan.chapter_12;

//Demonstrate autoboxing/unboxing
public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100;  //autobox an int
        int i = iOb;    //auto-unbox
        System.out.println(i + " " + iOb);  //displays 100 100
    }
}