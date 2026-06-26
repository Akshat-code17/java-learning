import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from the user till user press X or x

        int ans = 0;
        while(true) {
            // Take the operator as input
            System.out.print("Enter the operation: ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // take two number as input
                System.out.print("Enter the first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = in.nextInt();
                System.out.println();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0){
                        ans = num1 / num2;
                }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }else if (op == 'x' || op=='X'){
                break;
            }else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }



    }
}
