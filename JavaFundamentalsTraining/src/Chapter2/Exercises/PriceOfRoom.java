package Chapter2.Exercises;

import java.util.Scanner;

public class PriceOfRoom {
    public static void main(String[] args) {

        // Constants
        final double priceQueenBed = 125;
        final double priceKingBed = 139;
        final double priceKingSuite = 165;
        final double priceLakeView = 15;

        // Variables
        double totalPrice = 0;
        String roomDescription = "";
        String viewDescription = "";

        Scanner sc = new Scanner(System.in);

        // Prompt for room type
        System.out.println("Welcome to Afri-Resort" + "\n"
                + "A - Queen Bed" + "\n"
                + "B - King Bed " + "\n"
                + "C - King Bed & Pullout couch " + "\n"
                + "Exit to exit the menu" );

        String choiceOfRoom = sc.nextLine().toUpperCase();

        switch (choiceOfRoom) {
            case "A":
                totalPrice = priceQueenBed;
                roomDescription = "Queen Bed";
                break;
            case "B":
                totalPrice = priceKingBed;
                roomDescription = "King Bed";
                break;
            case "C":
                totalPrice = priceKingSuite;
                roomDescription = "King Bed & Pullout Couch";
                break;
            case "EXIT":
                System.out.println("Thank you for visiting Afri-Resort.");
                return;
            default:
                System.out.println("Invalid room type. Price set to $0.");
                return;
        }

        // Prompt for view only if room type is valid
        System.out.println("Please choose a view of your liking" + "\n"
                + "1 - Lake View" + "\n"
                + "2 - Park View" + "\n"
                + "exit to exit the menu" );

        String choiceOfView = sc.nextLine();

        switch (choiceOfView) {
            case "1":
                totalPrice += priceLakeView;
                viewDescription = "Lake View";
                break;
            case "2":
                viewDescription = "Park View";
                break;
            case "exit":
                System.out.println("Thank you for visiting Afri-Resort.");
                return;
            default:
                System.out.println("Invalid view selection. Price set to $0.");
                return;
        }

        // Final output
        System.out.println("Room Selection: " + roomDescription);
        System.out.println("View Selection: " + viewDescription);
        System.out.println("Total price of your room: $" + totalPrice);
    }
}