public class practice2{
    // Swap Two Numbers
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping :");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("After Swapping :");
        // int temp = a;
        // a = b;
        // b = temp;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        
    }
}