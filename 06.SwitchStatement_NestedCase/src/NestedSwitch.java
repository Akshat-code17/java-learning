import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("EmpID");
        int EmpID = in.nextInt();
        String department = in.next();

        // lengthier way to write

//        switch (EmpID){
//            case 1:
//                System.out.println("Akshat");
//                System.out.println("SDE");
//                break;
//            case 2:
//                System.out.println("Naman");
//                System.out.println("Manager");
//                break;
//            case 3:
//                System.out.println("Roshan");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "management":
//                        System.out.println("Management");
//                        break;
//                    default:
//                        System.out.println("no department entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");
//        }

        // Enhanced or better way to write

        switch (EmpID) {
            case 1 -> {
                System.out.println("Akshat");
                System.out.println("SDE");
            }
            case 2 -> {
                System.out.println("Naman");
                System.out.println("Manager");
            }
            case 3 -> {
                System.out.println("Roshan");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("Management");
                    default -> System.out.println("no department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
