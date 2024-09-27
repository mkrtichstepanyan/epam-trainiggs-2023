package homework_5.Galust_Arzumanyan.chapter_7;


// This method is used to demonstrate use an array to pass a variable number of arguments to a method
class PassArray {
    static void vaTest(int[] v) {
        System.out.println(" Number of args:" + v.length + " Contests: ");
        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
