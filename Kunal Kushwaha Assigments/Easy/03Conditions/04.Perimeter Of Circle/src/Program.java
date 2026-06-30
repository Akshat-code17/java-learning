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

        if(choice == 1){
            System.out.print("Enter Radius: ");
            float r = in.nextFloat();
            if(r > 0){
                double perimeter = Math.PI * r * 2;
                System.out.println("Perimeter Of Circle is "+perimeter);
            }else{
                System.out.println("Enter Valid input");
            }
        }else if(choice == 2){
            System.out.print("Enter Diameter: ");
            float d = in.nextFloat();
            if(d > 0){
                double perimeter = Math.PI * d;
                System.out.println("Perimeter Of Circle is "+perimeter);
            }else{
                System.out.println("Enter Valid input");
            }
        }
        in.close();
    }
}
