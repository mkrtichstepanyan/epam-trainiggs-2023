package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate variable-length arguments
public class VarArgs {
    static void vaTest(int... v) {
        System.out.println(" Number of args:" + v.length + " Contests: ");
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
