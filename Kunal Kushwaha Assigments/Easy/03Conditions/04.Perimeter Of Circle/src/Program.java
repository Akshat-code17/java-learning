import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---Perimeter Of Circle Calculator---");
        System.out.println("Press 1 for Radius");
        System.out.println("Press 2 for Diameter");
        System.out.print("Your Choice: ");
        int choice = in.nextInt();

        double radius = 0;

        if (choice == 1) {
            System.out.print("Enter Radius: ");
            radius = in.nextDouble();
        }
        else if (choice == 2) {
            System.out.print("Enter Diameter: ");
            radius = in.nextDouble() / 2;
        }

        if(radius > 0){
            double perimeter = Math.PI * radius * 2;
            System.out.println("Perimeter Of Circle is: "+ perimeter);
        }
        else{
            System.out.println("Enter Valid Input!");
        }
        in.close();
    }
}
