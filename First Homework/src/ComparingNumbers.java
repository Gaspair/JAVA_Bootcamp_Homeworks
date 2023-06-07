import java.util.Scanner;

public class ComparingNumbers {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Game starting!\n");
            System.out.print("What is your first number ?");
            double num1 = sc.nextDouble();
            System.out.print("What is your second number ?");
            double num2 = sc.nextDouble();




            String bigger;

            if(num1 > num2){
                bigger = "The first number is the bigger";
            } else if (num2>num1) {
                bigger = "The second number is bigger";

            }else if(num1 == num2){
                bigger = "The numbers are equal";

            }else{
                bigger = "There was an error";
            }

            System.out.println(bigger);

            sc.close();
        }

}
