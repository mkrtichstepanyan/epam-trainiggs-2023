package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class VarArgs {
    static void vaTest(int ... v){
        System.out.println("Numbers of args: " + v.length + "Contents: ");
        for(int x : v){
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
