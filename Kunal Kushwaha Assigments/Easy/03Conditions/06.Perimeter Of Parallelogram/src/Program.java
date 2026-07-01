import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("---Perimeter Of Parallelogram---");
            System.out.print("Enter side of the parallelogram : ");
            float side = in.nextFloat();
            System.out.print("Enter breadth of the parallelogram : ");
            float breadth = in.nextFloat();

            if (side > 0 && breadth > 0) {
                float perimeter = 2 * (side + breadth);
                System.out.println("Perimeter Of Parallelogram is " + perimeter);
            } else {
                System.out.println("Enter the valid input!!");
            }
            System.out.println("Do you want to calculate another ?");
            System.out.println("Enter 1 to continue");
            System.out.println("Enter 2 to quit");
            System.out.print(" Choice : ");

            int exitChoice = in.nextInt();
            if (exitChoice == 2) {
                keepRunning = false;
                System.out.println("Thank you!");
            }
            System.out.println("**************************");
        }
        in.close();
    }
}
