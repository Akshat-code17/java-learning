import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number:");
        int a = in.nextInt();
        System.out.print("Input the second number:");
        int b = in.nextInt();
        System.out.print("Input the third number:");
        int c = in.nextInt();

        // Q. Find the largest number among these 3
        int max = a;

        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);

    }
}
