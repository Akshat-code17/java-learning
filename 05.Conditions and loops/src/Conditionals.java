import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Syntax of if statement:
        if (boolean expression true or false){
            // body
        } else {
            // do this
         */
        System.out.print("Please enter your salary:");
        int salary = input.nextInt();
//        if (salary > 20000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;


        // Multiple if else statement
        if (salary > 50000) {
            salary += 5000;
        } else if (salary > 25000) {
            salary += 2500;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
