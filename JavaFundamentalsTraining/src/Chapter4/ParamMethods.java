package Chapter4;

import java.util.Arrays;

public class ParamMethods {
    public static void main(String[] args) {
        displayMessage("Welcome to Java Fundamentals");
        displayDetails("Puleng", 21, 166, 10000);

        System.out.println("\nSum: " + getSum(2, 5));
        System.out.println("\nSum:" + calcSum(2,3,1,4,3,2));
    }

    public static void displayMessage(String msg)
    {
        System.out.println(msg);
    }

    public static int getSum(int num1, int num2)
    {
        return num1 + num2;
    }

    public static void displayDetails(String name, int age, double height, float salary)
    {
        System.out.println("Name: "+name+" ,Age: "+age+" Height: "+height+" Salary: R"+salary);
    }

    public static double calcSum(double... numbers){
        return numbers.length;
    }

    public static double calcSum2(double... numbers){
        return Arrays.stream(numbers).sum();
    }
}
