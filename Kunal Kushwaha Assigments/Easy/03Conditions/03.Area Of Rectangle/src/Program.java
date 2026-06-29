import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length:");
        float length = in.nextFloat();
        System.out.print("Enter Breadth:");
        float breadth = in.nextFloat();

        if(length > 0 && breadth > 0){
            float area = (breadth * length) ;
            System.out.println("Area of rectangle:"+ area );
        }
        else {
            System.out.println("Invalid input");
        }
        in.close();

        
    }
}
