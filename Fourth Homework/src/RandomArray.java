import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int num1;
        int repetitions1 = 0;
        int num2;
        int repetitions2 = 0;

        System.out.println("What's the first number you want to check against?");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("What's the second number you want to check against?");
        num2 = Integer.parseInt(sc.nextLine());


        int[]arr = new int[10];
        for(int i = 0;i<arr.length;i++){
            arr[i] = rd.nextInt(10) + 1;

        }
        for(int number:arr){
            if(number == num1){
                repetitions1 += 1;
            } else if (number == num2) {
                repetitions2 +=1;

            }
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(repetitions1);
        System.out.println(repetitions2);

    }
}
