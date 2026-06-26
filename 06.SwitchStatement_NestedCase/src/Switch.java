import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

         if (fruit.equals("mango")){
             System.out.println("King of Fruit");
         }
        if (fruit.equals("apple")){
            System.out.println("a red sweet Fruit");
        }
    }
}
