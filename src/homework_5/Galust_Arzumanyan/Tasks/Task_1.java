package homework_5.Galust_Arzumanyan.Tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
//        printNumbers(5);             // Question 1 -> try with different integer values instead of 10 only
        sumNumbers();                // Question 2
//        factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//        reverseNumber();             // Question 5
//        readSetIntegers();           // Question 6
//        testPrime();                 // Question 7
    }


    //Function prints numbers from 1 to given parameter using recursion function.
    public static void printNumbers(int count) {
        if (count == 0) {
            System.out.println("Recursion ended");
            System.exit(0);
        }
        System.out.println(count);
        printNumbers(count - 1);


    }

    // This function  calculates the sum of first 10 natural numbers.

    public static void sumNumbers() {
        System.out.println("Please enter a number");
        Scanner console = new Scanner(System.in);
        int sum = sum(console.nextInt());
        System.out.println("Sum: " + sum);
    }

    private static int sum(int num) {
        int sum = 0;
        if (num == 0) {
            return 0;
        } else {
            sum = sum(num - 1) + num;
            return sum;
        }
    }


    // Function finds the factorial value of any number entered through the keyboard.
    public static int factorial(int n) {
        int result;
        if (n == 1) return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    public static void factorialDemo1() {

        System.out.println("Enter any positive integer: ");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int fact = 1; // To hold factorial
        fact = factorial(num);
        System.out.println("Factorial: " + fact);
    }


    /*
        Two numbers are entered through the keyboard.
        This function finds the value of one number raised to the power of another.
    */
    public static int power(int b, int p) {
        int result;
        if (p == 0) return 1;
        result = power(b, p - 1) * b;
        return result;
    }

    public static void powerDemo() {
        Scanner console = new Scanner(System.in);
        int base;
        int power;
        int result = 1;
        System.out.print("Enter the base number ");
        base = console.nextInt();
        System.out.print("Enter the power ");
        power = console.nextInt();
        result = power(base, power);
        System.out.println("Result: " + result);
    }

    // The function prompts the user to input an integer and then outputs the number with the digits reversed.


    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;
        int remainder = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();


        remainder = reverseNumberUtil(number, remainder);

        System.out.println("Reverse of " + number + " is " + remainder);
    }

    private static int reverseNumberUtil(int num, int reverse) {
        if (num == 0) {
            return reverse;
        } else {
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            return reverseNumberUtil(num / 10, reverse);
        }
    }


    /*
        The function prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */


    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();

        boolean flag = true;

        flag = isPrime(number, 2);

        System.out.println("The " + number + " is prime.--> " + flag);

    }

    private static boolean isPrime(int num, int i) {
        if (num < 2 || num % i == 0) {
            return false;
        }
        if (num == 2 || i * i > num) {
            return true;
        }

        return isPrime(num, i + 1);
    }
}
