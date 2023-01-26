package homework_3.Anush_Ananyan.tasks;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
//        FindHcf();                   // Question 8
//        sumAgain();                  // Question 9
//        countNumbers();              // Question 10
//        findMaxMin();                // Question 11
//        armstrongNumber();           // Question 12
//        fibonacciSeries();           // Question 13
//        sumOfSeries();               // Question 14
//        guessMyNumber();             // Question 15
    }


    /* TODO: Question 8
        Write a program to calculate HCF of Two given number.
    */
    public static void FindHcf() {
        Scanner console = new Scanner(System.in);

        int number1, number2;
        int remainder, hcf = 0;

        System.out.print("Enter the first number ");
        number1 = console.nextInt();

        System.out.print("Enter the second number ");
        number2 = console.nextInt();

        boolean isHCF = false;
        int smallNumber = number1 > number2 ? number2 : number1;
        int bigNumber = number1 > number2 ? number1 : number2;
        while (!isHCF) {
            remainder = bigNumber % smallNumber;
            if (remainder == 0) {
                hcf = smallNumber;
                isHCF = true;
            } else {
                bigNumber = smallNumber;
                smallNumber = remainder;
            }
        }
        System.out.println("HCF: " + hcf);
    }



    /* TODO: Question 9
        Write a do-while loop that asks the user to enter two numbers.
        The numbers should be added and the sum displayed.
        The loop should ask the user whether he or she wishes to perform the operation again.
        If so, the loop should repeat; otherwise it should terminate.
    */

    public static void sumAgain() {
        Scanner console = new Scanner(System.in);

        int number1, number2;
        char choice;

        // Todo write your code here ...
        do {
            System.out.print("Enter the first number ");
            number1 = console.nextInt();

            System.out.print("Enter the second number ");
            number2 = console.nextInt();

            System.out.println("Sum of the numbers: " + (number1 + number2));

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Sum of even numbers: " + (number1 + number2));
    }



    /* TODO: Question 10
        Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
        negative and zeros entered.
    */

    public static void countNumbers() {
        Scanner console = new Scanner(System.in);

        int number, countPositive = 0, countNegative = 0, countZero = 0;

        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            // Todo write your code here ...
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }


     /* TODO: Question 11
         Write a program to enter the numbers till the user wants and
         at the end the program should display the largest and smallest numbers entered.
    */

    public static void findMaxMin() {
        Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value
        char choice;

        // Todo write your code here ...
        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }


    /* TODO: Question 12
        Write a program to print out all Armstrong numbers between 1 and 500.
        If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
    */
    public static void armstrongNumber() {
        int digit1,  // To hold first digit (Ones) of number
                digit2,  // To hold second digit (Tens) of number
                digit3;  // To hold third digit (Hundreds) of number

        // Todo write your code here ...
        for (int i = 1; i <= 500; i++) {

            digit3 = i % 10;
            digit2 = ((i - digit3) / 10) % 10;
            digit1 = (((i - digit3) / 10 - digit2) / 10) % 10;

            int sumOfDigit = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);

            if (i == sumOfDigit) {
                System.out.println("Armstrong numbers are:" + " " + i);
            }

        }
    }


    /* TODO: Question 13
        Write a program to print Fibonacci series of n terms where n is input by user :
        0 1 1 2 3 5 8 13 24 .....
    */
    public static void fibonacciSeries() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        int firstTerm = 0, secondTerm = 1, thirdTerm;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        // Todo write your code here ...

        for (int i =firstTerm; i <= number; i++) {
            System.out.print(firstTerm + " ");

            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }


    /* TODO: Question 14
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    */
    public static void sumOfSeries() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        double sum = 0;
        double num;
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        // Todo write your code here ...
        for (double i = 1; i <= number; i++) {
            num = 1 / i;
            sum += num;
        }

        System.out.println("sum: " + sum);
    }


    /* TODO: Question 15
         Write a program that generates a random number and asks the user to guess what the number is.
         If the user's guess is higher than the random number, the program should display "Too high, try again."
         If the user's guess is lower than the random number, the program should display "Too low, try again."
         The program should use a loop that repeats until the user correctly guesses the random number.
    */
    public static void guessMyNumber() {
        Scanner console = new Scanner(System.in);

            int number, // To hold the random number
                guess,  // To hold the number guessed by user
                tries = 0; // To hold number of tries

        System.out.println("Guess My Number Game");
        System.out.println();

        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100

        while (true) {
            System.out.print("Guess the number ");
            guess = console.nextInt();
            tries++;
            if (guess < 1 || guess > 100) {
                System.out.println("You must enter number between 1 to 100");
                continue;
            }
            if (guess < number) {
                System.out.println("Entered number is smaller ");
            } else if (guess > number) {
                System.out.println("Entered number is bigger ");

            } else {
                System.out.println("Congratulations you won! You tried " + tries + " times");
                break;
            }
        }
    }
}