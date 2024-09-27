package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate varargs and overloading
class VarArgs2 {
    static void vaTest(int... v) {
        System.out.println(" vaTest(int): " + "Number of args: " + v.length + " Contests ");
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println(" vaTest(boolean...v): " + "Number of args: " + v.length + " Contests ");
        for (boolean x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println(" vaTest(String msg, int...v): " + "Number of args: " + msg + v.length + " Contests ");
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(" Testing: ", 10, 20);
        vaTest(true, false, false);
    }
}
