import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit: ");
        String fruit = in.next();
        switch (fruit.toLowerCase()) {
            case "mango" -> System.out.println("king of the fruit");
            case "apple" -> System.out.println("Red sweet fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
