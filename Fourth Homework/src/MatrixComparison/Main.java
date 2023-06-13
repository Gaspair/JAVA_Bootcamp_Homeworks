package MatrixComparison;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        System.out.println("What's the first number you want to check against?");
        int rows = Integer.parseInt(sc.nextLine());

        System.out.println("What's the second number you want to check against?");
        int columns = Integer.parseInt(sc.nextLine());


        int[][] sumMatrice = new int[rows][columns];
        int[][] produsMatrice = new int[rows][columns];


        RandomMatrice firstMatrice = new RandomMatrice(rows, columns);
        RandomMatrice secondMatrice = new RandomMatrice(rows, columns);



    for(int i = 0; i<sumMatrice.length;i++){
        System.out.println();
        for(int j = 0;j<sumMatrice[i].length;j++){
            sumMatrice[i][j] = firstMatrice.getNumber( i, j) + secondMatrice.getNumber( i, j);
            System.out.print(sumMatrice[i][j] + " ");
        }
    }
        System.out.println();

    for(int i =0;i <produsMatrice.length; i++){
        System.out.println();
        for(int j = 0;j<produsMatrice[i].length;j++){

            for(int x = 0; x<secondMatrice.getRow();x++){
                produsMatrice[i][j] += firstMatrice.getNumber(i,x) * secondMatrice.getNumber(x,j);

            }
            System.out.print(produsMatrice[i][j] + " ");
        }
    }



    }
}
