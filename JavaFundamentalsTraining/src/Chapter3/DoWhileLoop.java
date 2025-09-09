package Chapter3;
/*
* @author Puleng Senyatso
* */
public class DoWhileLoop {
    public static void main(String[] args) {

        char option = 'a';

        do{
            System.out.println("option = " + option);
            option++;
        }while(option == 'd');
    }
}
