package homework_5.shushanik_araqelyan;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
  //        printNumbers(10);            // Question 1 -> try with different integer values instead of 10 only
 //       sumNumbers();                // Question 2
//        factorialDemo1();            // Question 3
//        powerDemo();                 // Question 4
//   //     reverseNumber();             // Question 5
//        readSetIntegers();           // Question 6
        testPrime(17);                 // Question 7
    }


    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        //      Todo write your code here ...

    }


    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        // Todo write your code here ...
        int i, num = 10;


        System.out.println("Sum = " + sum);
    }





    /* TODO: Question 3
        Write a program to find the factorial value of any number entered through the keyboard.
    */
        public static void factorialDemo1 (int num) {

            int fact = 1; // To hold factorial

            // Todo write your code here ...

            System.out.println("Factorial: " + fact);
        }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

        public static void powerDemo (int base, int power) {


            int result = 1;


            // Todo write your code here ...

            System.out.println("Result: " + result);
        }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

        public static void reverseNumber (int number) {


            int reverse = 0;


            int temp = number;
            int remainder = 0;

            // Todo write your code here ...

            System.out.println("Reverse of " + number + " is " + reverse);
        }


    /* TODO: Question 6
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
        public static boolean testPrime (int number) {

           boolean flag = true;

           // Todo write your code here ...
            if(number % 2 ==0){
                if(number <=1)
                testPrime ( number) ;
                return false;
            }
return true;
       }
  }


