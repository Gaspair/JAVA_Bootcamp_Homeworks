import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number?");
        int number = Integer.parseInt(sc.nextLine());

        if ((number % 2 == 0) && (number != 2)) {
            System.out.printf("%d is not a prime number!",number );
        } else if ((number % 3 == 0) && (number != 3)) {
            System.out.printf("%d is not a prime number!",number );
        }else if ((number % 5 == 0) && (number != 5)) {
            System.out.printf("%d is not a prime number!",number );
        }else if ((number % 7 == 0) && (number != 7)) {
            System.out.printf("%d is not a prime number!",number );
        }else{
            System.out.printf("%d is a prime number!",number );
        }

    }
}
