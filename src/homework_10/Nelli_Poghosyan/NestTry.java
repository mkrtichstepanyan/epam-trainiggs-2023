package homework_10.Nelli_Poghosyan;

public class NestTry {
    public static void main(String[] args) {
        try{
            int a = args.length;
            /* if no command-line args are present,
            the following statement will generate
            a divide-by-zero exception. */
            int b = 42/a;
            System.out.println("a = " + a);
        try { //nested try block
            /*if one command-line arg is used,
            then a divide-by-zero exception
            will be genetated by the following code. */
            if(a == 1) a = a/(a-a); //division by zero
        /* if two command-line args are used.
        then generate an out-of-bounds exception
         */
            if(a == 2){
                int[] c ={1};
                c[42] = 99;//generate an out-of-bounds exception
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out-of-bounds: "+ e);
        }
        }catch (ArithmeticException e){
            System.out.println("Divide by 0: "+ e);
        }
    }
}
