package Chapter5;

public class InitializingArray {
    public static void main(String[] args) {
        int[] arNumbers = new int[]{1, 2, 3, 4, 5};
        String[] arNames = new String[]{"Dan", "Ken", "Bro","Danny", "Pandra"};
        double[] arPrices = new double[]{11.99, 25.89, 36.50, 40.00, 50.00};

        //accessing array elements
        for(int i = 0; i <= arNumbers.length -1  ; i++)
        {
            System.out.println(arNumbers[i]);
        }
        System.out.println("=================Names====================");
        int count = 0;
        while (count < arNames.length)
        {
            System.out.println(arNames[count]);
            count++;
        }
        System.out.println("=================Prices====================");
        //enhanced loop, works with collections
        System.out.println("old price\tNew price");
        for (double price : arPrices){
            price = price + (price * 0.1);//change each price
            System.out.println(price);
        }
    }
}
