package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate using varargs with standard arguments
class VarArgs1 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " Contests: ");
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(" One varang: ", 10);
        vaTest(" Three varangs: ", 1, 2, 3);
        vaTest(" No varangs ");
    }
}
