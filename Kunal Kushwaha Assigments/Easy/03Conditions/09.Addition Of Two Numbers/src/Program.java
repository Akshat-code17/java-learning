import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean keepRunning = true;
        while(keepRunning){
            System.out.println("---Addition Of Two Numbers calculator---");
            System.out.print("Enter the First number: ");
            double first = in.nextDouble();
            System.out.print("Enter the Second number: ");
            double second = in.nextDouble();

            double addition = first + second;
            System.out.println("Addition Of Two Numbers is " + addition);

            System.out.println("Want to add the another number");
            System.out.println("Press 1 for Yes");
            System.out.println("Press 2 for No");
            System.out.println("Choice: ");

            int choice = in.nextInt();

            if(choice == 2) {
                keepRunning = false;
                System.out.println("Thank you!");
            }
            System.out.println("*****************************");
        }
        in.close();
    }
}
