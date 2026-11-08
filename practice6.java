import java.util.Scanner;
public class practice6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student details");
        System.out.print("enter name : ");
        String name = sc.next();
        System.out.print("enter marks1 : ");
        int marks1 = sc.nextInt();
        System.out.print("enter marks2 : ");
        int marks2 = sc.nextInt();
        System.out.print("enter marks3 : ");
        int marks3 = sc.nextInt();
        int total = marks1+marks2+marks3;
        int pra = total/3;
        System.out.println("Name : "+ name);
        System.out.println("Marks1 : "+ marks1);
        System.out.println("Marks2 : "+ marks2);
        System.out.println("Marks3 : "+ marks3);
        System.out.println("Total marks : "+ total);
        System.out.println("percentage : "+ pra);
    }
}