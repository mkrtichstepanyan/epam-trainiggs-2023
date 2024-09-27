package homework_5.Galust_Arzumanyan.chapter_7;


//  This method is used to demonstrate another example that uses recursion
class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}
