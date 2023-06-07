import java.math.BigInteger;
import java.util.Scanner;

public class Exponential {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number?");
        String input = sc.nextLine();
        BigInteger number = new BigInteger(input);
        System.out.println("To what power ?");
        int power = Integer.parseInt(sc.nextLine());


        for(int i = 0; i < power-1; i++){
            number = number.multiply(number);

        }
        System.out.println(number);
    }
}
