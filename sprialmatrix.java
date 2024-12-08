import java.util.*;
public class sprialmatrix {
    public static void printSpril(int matrix[][]){
    int startrow = 0;
    int startcol = 0;
    int endrow = matrix.length-1;
    int endcol = matrix[0].length-1;

    while(startrow <= endrow && startcol <= endcol){
        //top
        for(int j = startcol; j<=endcol; j++ ){
            System.out.print(matrix[startrow][j]+ " ");
        }
        //System.out.println();
        //right
        for(int i = startrow+1; i<=endrow; i++){
            System.out.print(matrix[i][endcol]+ " ");
        }
        //System.out.println();
        //bottom
        for(int j = endcol-1; j>=startcol; j--){
            if(startrow == endrow){
                break;
            }
            System.out.print(matrix[endrow][j]+ " ");
        }
        //System.out.println();
        //left
        for(int i = endrow-1; i>=startrow+1; i--){
            if(startcol == endcol){
                break;
            }
             System.out.print(matrix[i][startcol]+ " ");
        }
         //System.out.println();
         startcol++;
         startrow++;
         endcol--;
         endrow--;
    }
    System.out.println();
    }
    public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4},
                     {12,13,14,5},
                     {11,16,15,6},
                     {10,9,8,7}}; 
    printSpril(matrix) ;
    }
}
