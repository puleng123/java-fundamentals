package Chapter1;

import javax.swing.*;

public class GUIUserInput {

    public static void main(String[] args) {
        String firstname;
        String age;
        String height;
        String salary;
        char initial;

        firstname =  JOptionPane.showInputDialog("Enter First Name: ");
        JOptionPane.showMessageDialog(null, "First Name: " + firstname);

        age =  JOptionPane.showInputDialog("Enter age: ");
        JOptionPane.showMessageDialog(null, "AGE: " + age);
        int ageInt = Integer.parseInt(age);

        height =  JOptionPane.showInputDialog("Enter height: ");

        JOptionPane.showMessageDialog(null, "Height: " + height);
        double heightInt = Double.parseDouble(height);
        salary =  JOptionPane.showInputDialog("Enter your salary: R");
        JOptionPane.showMessageDialog(null, "Salary: " + salary);
        float salaryInt = Float.parseFloat(salary);

        System.out.println("\n=================Details=============");
        System.out.println("First Name: " + firstname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: R" + salary);


    }
}
