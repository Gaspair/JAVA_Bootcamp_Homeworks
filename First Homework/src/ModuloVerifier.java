import java.util.Scanner;

public class ModuloVerifier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your number?");
        int number = sc.nextInt();

        String value;
        if(isDivisibleBy3(number) && isDivisibleBy5(number)){
            System.out.println(number + " is both divisible by 3 and 5.");
        }
        else if(isDivisibleBy3(number)){
            System.out.println(number + " is divisible by 3.");
        }else if(isDivisibleBy5(number)){
            System.out.println(number + " is divisible by 5.");
        }
    }


    public static boolean isDivisibleBy3(int number){
        return number % 3 == 0;
    }


    public static boolean isDivisibleBy5(int number){
        return number % 5 == 0;
    }

}
