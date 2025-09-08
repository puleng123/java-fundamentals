package Chapter1;
/*
 * this class shows different escape characters
 * @auther Puleng Senyatso
 * '\n' - newline
 * '\t' - tab
 * '\b' - backspace
 * */
public class ExploreStrings {
    public static void main(String[] args) {
        String firstName = "Puleng";
        String lastName = "Senyatso";
        String sentence = "Video provides a powerful way to help you prove your point";
        int lengthWithoutSpaces = sentence.replace(" ","").length();

        System.out.println(firstName + " has " + firstName.length() + " letters");
        System.out.println("'y' is found at index position: " + lastName.indexOf("y"));
        System.out.println("Is Senyatso = " + lastName + "? " + lastName.equals("Senyatso"));
        System.out.println("The third letter from " + firstName + " is: " + firstName.charAt(2));
        System.out.println("No of sentence length excluding spaces: " + lengthWithoutSpaces);
    }
}
