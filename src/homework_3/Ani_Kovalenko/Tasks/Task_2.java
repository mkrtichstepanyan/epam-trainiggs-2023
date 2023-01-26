package homework_3.Ani_Kovalenko.Tasks;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
//        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
//        sumNumbers();                // Question 2
//        factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber();             // Question 5
//        readSetIntegers();           // Question 6
//        testPrime();                 // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        // Todo write your code here ...
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for(int b:a){
            System.out.print(b + " ");
        }
        System.out.println();
        for(int i=1;i<=count; i++){
            System.out.print(i +" ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int b: a){
            sum += b;
        }System.out.println("SUM = " + sum);
    }


    /* TODO: Question 3
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
    */
    public static void table() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);
        for(int i=0; i<= 10; i++){
            System.out.print(num + " * " + i + " = " + (num*i));
            System.out.println();
        }
    }


    /* TODO: Question 4
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        long fact = 1L; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        for(int i=2;i<=num;i++){
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static void powerDemo() {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        for(int i= 0;i<power; i++){
            result = result * base;
        }

        System.out.println("Result: " + result);
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while(temp > 0){
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    /* TODO: Question 6
         Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    */

    public static void readSetIntegers() {
        Scanner console = new Scanner(System.in);

        int number;
        char choice = 1;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            for (int i = 1; i <= number; i++) {
                if (number % 2 == 0) {
                    evenSum++;
                } else {
                    oddSum++;
                }
            }
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while (choice == 'y' || choice == 'Y') ;

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
    /* TODO: Question 7
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();
        if (number == 0 || number == 1) {
            System.out.println("0 and 1 are not prime number");
        } else {
            boolean flag = true;


            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }

        }
    }
}