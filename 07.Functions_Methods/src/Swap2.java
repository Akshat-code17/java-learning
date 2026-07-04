public class Swap2 {
    public static void main(String[] args) {
        int a = 50;
        int b = 34;

        swap(a , b);
        System.out.println(a + "  " + b);

        String name = "Akshat Kumar";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Naman";
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
