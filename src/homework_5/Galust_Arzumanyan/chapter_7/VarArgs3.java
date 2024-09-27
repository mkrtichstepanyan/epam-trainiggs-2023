package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate varargs, overloading, ambiguity
class VarArgs3 {
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

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        //   vaTest(); Error, Ambiguous
    }
}
