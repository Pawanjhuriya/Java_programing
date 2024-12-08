public class CrossSum {
    public static int crossSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {12,13,14,5},
                          {11,16,15,6},
                          {10,9,8,7}};
        int result = crossSum(matrix);
        System.out.println("Cross sum: " + result);
    }
}
