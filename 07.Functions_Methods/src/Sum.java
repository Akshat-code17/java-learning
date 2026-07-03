import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);

    }
    // Pass the Value of numbers when you are calling the methods in main()
    static int sum3(int a , int b){
        int sum = a + b;
        return sum;
    }

    // return the Value
    static int sum2(){
        Scanner in = new Scanner(System.in);

        int num1 , num2 , sum;

        System.out.print("Enter First number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;

        // System.out.println("hello"); ..this will never execute
    }
    static void sum(){
        Scanner in = new Scanner(System.in);

        int num1 , num2 , sum;

        System.out.print("Enter First number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);

    }

    /*
    return_type name(arguments ) {
       // body
       return statement;

    }

     */
}
