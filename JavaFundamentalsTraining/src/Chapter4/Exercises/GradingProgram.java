package Chapter4.Exercises;

import java.time.Year;
import java.util.Scanner;

public class GradingProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greetings();

        // prompt user for their information
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter your test mark: ");
        int testMark = sc.nextInt();

        // Determine age and grade
        int age = determineAge(birthYear);
        String grade = determineGrade(testMark);

        // Display output
        displayOutput(firstName, lastName, age, grade);
    }

    //display greetings
    public static void greetings() {
        System.out.println(" Welcome to the Student Grading Program!");
    }

    //determine grade
    public static String determineGrade(int testMark) {
        return testMark >= 90 ? "A+" :
                testMark >= 80 ? "A"  :
                testMark >= 70 ? "B"  :
                testMark >= 60 ? "C"  :
                testMark >= 50 ? "D"  :
                testMark >= 40 ? "D-" : "F";
    }

    // determine age
    public static int determineAge(int birthYear) {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;

        /*
        * if (birthYear.Length() != 4)
        * {
        *       System.out.println(Invalid input, expected length is 4)
        * }
        * */

    }

    // display student details
    public static void displayOutput(String firstName, String lastName, int age, String grade) {
        System.out.println("\n📋 Student Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name:  " + lastName);
        System.out.println("Age:        " + age);
        System.out.println("Grade:      " + grade);
    }
}