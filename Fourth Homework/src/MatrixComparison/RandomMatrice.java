package MatrixComparison;

import java.util.Random;

public class RandomMatrice {
    Random rd = new Random();
    private int rows=0;
    private int columns=0;
    private int [][] numbers;



     RandomMatrice(int rows, int columns){
        this.setRows(rows);
        this.setColumns(columns);
        numbers = new int[rows][columns];

        for(int i = 0; i<numbers[0].length; i++){
            System.out.println();
            for(int j= 0; j<numbers[i].length;j++){
                numbers[i][j] = rd.nextInt(10) + 1;
                System.out.print(numbers[i][j] + " ");
            }

        }
         System.out.println();


    }

    public int getNumber(int x,int y){
        return numbers[x][y];
    }

    public int getRow(){return rows;};



    public void setRows(int rows){
        this.rows= rows;
    }

    public void setColumns(int columns){
        this.columns= columns;
    }


}
