package homework_3.Nelli_Poghosyan.Chapter_5;

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done;){
            System.out.println("i is "+ i);
            if(i == 10) done = true;
            i++;
        }
    }
}