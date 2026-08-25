public class Shadowing {
    static int x = 22; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 22
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialized
        x = 40;
        System.out.println(x); // 40
        fun();

    }

    static void fun() {
        System.out.println(x);

    }
}
