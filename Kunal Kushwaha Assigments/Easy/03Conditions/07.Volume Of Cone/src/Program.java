import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning){
            System.out.println("---Volume Of Cone calculator---");
            System.out.print("Enter the Height of Cone: ");
            float height = in.nextFloat();
            System.out.println("The value you want to use");
            System.out.println("Press 1 for radius");
            System.out.println("Press 2 for diameter");
            System.out.print("Choice : ");
            int choice = in.nextInt();

            float radius = 0;

            if(choice == 1){
                System.out.print("Enter Radius: ");
                radius = in.nextFloat();
            }
            else if(choice == 2){
                System.out.print("Enter Diameter: ");
                radius = in.nextFloat()/2;
            }
            else{
                System.out.println();
            }
            if(radius > 0){
                double Volume = 1.0/3.0 * radius * radius * height * Math.PI ;
                System.out.println("Volume Of Cone is "+ Volume);
            }
            else{
                System.out.println("Enter Valid Input!");
            }
            System.out.println("Do You wish to calculate another?");
            System.out.println("Press 1 to continue");
            System.out.println("Press 2 to exit");
            System.out.print("Choice : ");
            int exitChoice = in.nextInt();

            if(exitChoice == 2) {
                keepRunning = false;
                System.out.println("Thank you!");
            }
            System.out.println("*********************************");
        }
        in.close();
    }
}
