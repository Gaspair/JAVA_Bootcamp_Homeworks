import java.util.Scanner;

public class SumScanner {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number?");
        int number = Integer.parseInt(sc.nextLine());

    for(int i = 0; i <= number; i++) {
        System.out.println(i);
    }
    }


    }

