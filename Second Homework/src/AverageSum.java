import java.util.Scanner;

public class AverageSum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your number ?");
        int number = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for(int i=0;i<=number;i++){
             sum += i;
        }
        System.out.println(sum/number);


    }

}
