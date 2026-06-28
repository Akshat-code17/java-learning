import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 for Radius");
        System.out.println("Press 2 for Diameter");
        System.out.print("Your Choice: ");
        int choice = in.nextInt();
        double radius = 0;
        if(choice == 1){
            System.out.print("Enter the radius:");
            radius = in.nextDouble();
        }
        else if(choice == 2){
            System.out.print("Enter the diameter:");
            radius = in.nextDouble()/2;
        }
        double Area = Math.PI * radius * radius;
        System.out.println("Area =" + Area);

        in.close();

    }
}
