public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        String name = "rahul";

        {
//            int a = 67; // already initialized outside the block in the same block, hence you cannot initialize again.
            a = 100;
            name = "Kunal";
            System.out.println(name);
            System.out.println(a);
            int c = 99;
            // Values initialized in this block remain in this block
        }
        System.out.println(name);
        System.out.println(a);
//        System.out.println(c); // cannot be used outside the block

        // scoping in for loops
        for ( int i = 0; i < 4; i++){
//            System.out.println(i);
            int num = 90;
            a = 10000000;
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
