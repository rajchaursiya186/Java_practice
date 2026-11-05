public class practice3{
    // Employee Salary Details
    public static void main(String[] args) {
        String name = "Raj";
        int salary = 20000;
        int bonus = 3000;
        int deductions = 1500;
        int netsalary = salary + bonus -deductions;
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Bonus : "+bonus);
        System.out.println("Net Salary : "+netsalary);
    }
}