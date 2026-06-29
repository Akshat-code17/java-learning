import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base:");
        int base = in.nextInt();
        System.out.print("Enter the Height:");
        int height = in.nextInt();

        if(base > 0 && height > 0){
            double area = (base * height)/2.0 ;
            System.out.println("Area of triangle:"+ area );
        }
        else {
            System.out.println("Invalid input");
        }
        in.close();

    }
}
