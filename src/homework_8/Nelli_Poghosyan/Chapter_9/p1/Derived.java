package homework_8.Nelli_Poghosyan.Chapter_9.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("derived constructor");
        System.out.println("n = " + n);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
