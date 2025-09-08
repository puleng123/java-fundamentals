package Chapter1;

import java.util.Scanner;

public class InputFromUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        double height;
        float salary;
        boolean isMarried = true;
        char initial;
        String firstName;
        //use
        System.out.println("Please enter your first name: ");
        firstName = sc.nextLine();
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        System.out.println("Please enter your height: ");
        height = sc.nextDouble();
        System.out.println("Please enter your salary: ");
        salary = sc.nextFloat();
        System.out.println();

        System.out.println("\n=================Details=============");
        System.out.println("First Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: R" + salary);
    }
}
