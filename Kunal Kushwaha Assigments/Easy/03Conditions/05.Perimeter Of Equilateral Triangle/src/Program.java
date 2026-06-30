import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---Perimeter Of Equilateral Triangle Calculator---");
        System.out.print("Enter the Triangle Side: ");

        float side = in.nextFloat();

        if(side > 0){
            float perimeter = side * 3;
            System.out.println("Perimeter Of Equilateral Triangle is "+side);
        }
        else{
            System.out.println("Enter Valid Input");
        }
        in.close();
    }
}
