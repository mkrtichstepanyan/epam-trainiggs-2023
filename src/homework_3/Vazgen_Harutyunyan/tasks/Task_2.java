package homework_3.Vazgen_Harutyunyan.tasks;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
        sumNumbers();                // Question 2
        table();
        factorialDemo1();            // Question 3
        powerDemo();                 // Question 4
        reverseNumber();             // Question 5
        readSetIntegers();           // Question 6
        testPrime();                 // Question 7545
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("\n\nSum: " + sum);
    }

    /* TODO: Question 3
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
    */
    public static void table() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("\n\nEnter any positive integer: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i < 10; i++) {
            System.out.println(num * i);
        }
    }


    /* TODO: Question 4
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("\nEnter any positive integer: ");
        num = console.nextInt();

        for (int i = num; i > 0; i--) {
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

        while (power != 0) {
            result = result * base;
            --power;
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

        while (number != 0) {

            int remainder = number % 10;

            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reverse of " + temp + " is " + reverse);
    }

    /* TODO: Question 6
         Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    */

    public static void readSetIntegers() {
        Scanner console = new Scanner(System.in);


        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            for (int i = number; i >= 1 ; i--) {
                if (i % 2 == 0)
                    evenSum = evenSum + i;
                else if(i % 2 >= 1){

                    oddSum += i;
                }
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);


        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    /* TODO: Question 7
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        int number ;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();

        boolean flag = true;
        int i = 2;

        while (i <= number / 2) {
            if (number % i == 0) {
                flag = false;
                break;
            }

            ++i;
        }

        if (flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

    }
}
