public class practice4{
    // type casting 
    public static void main(String[] args) {
        // widening(implicit) casting
        // byte->short->int->long->float->double
        int a = 10;
        double b = a;
        System.out.println("Widening(implicit) casting : ");
        System.out.println(b);
        // Narrowing(explicit) casting
        System.out.println("Narrowing(explicit) casting : ");
        double x = 10.99;
        int y = (int) x;
        System.out.println(y);
    }
}