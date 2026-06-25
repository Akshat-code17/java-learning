import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
          // Syntax of for loop:
             for (initialization; condition; increment/decrement) {
             // body
             }
         */
        // qu. print number from 1 to 5
        for (int number = 1; number <=5; number += 1) {
            System.out.println(number);
        }

          // print number 1 to n (user input)
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = in.nextInt();
        for( int num =1; num <= n; num += 1 ){
            System.out.println(num);
        }

        // While Loop
        /*
        Syntax:
        While(condition) {
          // body
         }
         */
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num += 1;
        }

        // do while loop
        /*
        Syntax:
              do {
               // body
              } While (condition);

         */

        do {
            System.out.println(n);
            n++;

        } while(n<=7);

    }

}

// use while loop when you don't know how many times the loop will happen
// use for loop when you know how many times it loops wil have to happen
// do while loop  will run at least once