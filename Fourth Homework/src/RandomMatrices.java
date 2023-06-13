import java.util.Random;
import java.util.Scanner;

public class RandomMatrices {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int row = 0;
        int columns = 0;

        System.out.println("What's the first number you want to check against?");
        row = Integer.parseInt(sc.nextLine());

        System.out.println("What's the second number you want to check against?");
        columns = Integer.parseInt(sc.nextLine());


    int [][] numbers = new int[row][columns];



    for(int i = 0; i<numbers.length; i++){
        System.out.println();
        for(int j= 0; j<numbers[i].length ;j++){
            numbers[i][j] = rd.nextInt(10) + 1;
            System.out.print(numbers[i][j] + " ");
        }
    }

    }
}
