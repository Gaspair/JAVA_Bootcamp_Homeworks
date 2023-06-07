import java.util.Scanner;

public class SwitchNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int c;

        System.out.println("What is your A number?");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("What is your B number?");
        int b = Integer.parseInt(sc.nextLine());
        c=b;
        b=a;
        a=c;

        System.out.println("Now your numbers are switched, A is now "+a+ " and B turned into "+b);

    }
}
