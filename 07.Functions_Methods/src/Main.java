import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q. Take input of two numbers and print the sum
        Scanner in = new Scanner(System.in);

        int num1 , num2 , sum;

        System.out.print("Enter First number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);

    }
}
