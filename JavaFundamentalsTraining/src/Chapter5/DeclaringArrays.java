package Chapter5;

public class DeclaringArrays {
    public static void main(String[] args) {

        //declaration
        int[] arNumbers = new int[5];
        String[] arNames = new String[5];
        double[] arPrices = new double[5];

        //Assigning numbers
        arNumbers[0] = 1;
        arNumbers[1] = 2;
        arNumbers[2] = 3;
        arNumbers[3] = 4;
        arNumbers[4] = 5;

        System.out.println("Number of arNumbers: " + arNumbers.length);
        System.out.println("Get number in the 3rd index: " + arNames[3]);

        //Assigning Names
        arNames[0] = "Ari";
        arNames[1] = "Ben";
        arNames[2] = "Dan";
        arNames[3] = "Ken";
        arNames[4] = "Bro";


    }
}
