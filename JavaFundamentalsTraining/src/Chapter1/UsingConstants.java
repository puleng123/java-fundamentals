package Chapter1;

public class UsingConstants {

    public static void main(String[] args) {
        final int CURRENT_YEAR = 2020;
        final String CURRENT_MONTH = "September";
        String welcomeMessage;

        welcomeMessage = "The month is " + CURRENT_MONTH + " and the year is " + CURRENT_YEAR;
        System.out.println(welcomeMessage);
    }
}
