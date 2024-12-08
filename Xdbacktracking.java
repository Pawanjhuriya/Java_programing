public class Xdbacktracking {
    public static void changeArr( int arr[], int i, int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }


        arr[i] = val;
        changeArr(arr , i+1 , val+1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }

    // public static void main(String[] args) {
    //     int arr[] = new int[5];
    //     changeArr(arr, 0, 1);
    //     printArr(arr);
    // }














    public static void findsubsets(String str, String ans , int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        findsubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findsubsets(str, ans, i+1);
        
    }


    // public static void main(String[] args) {
    //     String str = "Pawan";
    //     findsubsets(str, " ", 0);
    // }











    public static void permutation(String str, String ans ){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<str.length(); i++){
           char curr = str.charAt(i);
           String NewStr= str.substring(0, i)+str.substring(i+1);
           permutation(NewStr, ans+curr);
        }
    }


    // public static void main(String[] args) {
    //     String str = "abc";
    //     permutation(str, " ");
    // }


























    public static void NQueen(char board[][], int row){
        if(row == board.length){
            // printboard(board);
            count++;
            return;
        }

        for(int j=0; j<board.length; j++){
            if(issafe(board, row , j)){
               board[row][j] ='Q';
               NQueen(board, row+1);
               board[row][j] = '.';
            }
    }
    }
   
    public static boolean issafe(char board[][], int row , int col){
            //vertical up
            for(int i=row-1; i>=0; i--){
                if(board[i][col] == 'Q'){
                    return false;
                }
                
            }

            //dia left up 
            for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }

            //dia right up
            for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++){
                if(board[i][j] == 'Q'){
                    return false;
                }
            }

            return true;
        }

    public static void printboard(char board[][]){
        System.err.println("------Chesh Board------");
        for(int i=0; i<board.length; i++){
            for(int j = 0; j< board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;

    // public static void main(String[] args) {
    //     int n = 4;
    //     char board[][] = new char[n][n];
    //     for(int i = 0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             board[i][j]= '.';
    //         }
    //     }
    //     // printboard(board);
    //     NQueen(board, 0);
    //     System.out.println("Total ways of places N Queen = "+count);
    // }














    public static int Gridways(int i , int j, int n, int m){
        if(i == n-1 || j == m-1){
            return 1;
        }else if(i == n || j == n){
            return 0;
        }

       int w1 = Gridways(i+1, j, n, m);
       int w2 = Gridways(i, j+1, n, m);
       return w1 + w2;

    }

    // public static void main(String[] args) {
    //     int n =3;
    //     int m = 3;
    //     System.out.println("Total Ways is : "+Gridways(0, 0, n, m));
    // }

















  
    

   

    private static boolean solveSudoku(int[][] board) {
        int N = board.length;

        // Find an empty position
        int[] emptyPosition = findEmptyPosition(board);
        if (emptyPosition == null) {
            // No empty position, the Sudoku is solved
            return true;
        }

        int row = emptyPosition[0];
        int col = emptyPosition[1];

        // Try filling the empty position with numbers 1 to 9
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                // If it's safe, assign the number and try to solve the rest
                board[row][col] = num;

                if (solveSudoku(board)) {
                    return true; // If a solution is found, return true
                }

                // If the current assignment doesn't lead to a solution, backtrack
                board[row][col] = 0;
            }
        }

        // No number from 1 to 9 is valid, backtrack to the previous step
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        return !usedInRow(board, row, num) && !usedInColumn(board, col, num) && !usedInBox(board, row - row % 3, col - col % 3, num);
    }

    private static boolean usedInRow(int[][] board, int row, int num) {
        for (int col = 0; col < board.length; col++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean usedInColumn(int[][] board, int col, int num) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean usedInBox(int[][] board, int boxStartRow, int boxStartCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row + boxStartRow][col + boxStartCol] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] findEmptyPosition(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == 0) {
                    return new int[]{row, col};
                }
            }
        }
        return null; // If no empty position is found
    }

    private static void printSudoku(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
    


     public static void main(String[] args) {
        int[][] sudokuBoard = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(sudokuBoard)) {
            System.out.println("Sudoku solved successfully:");
            printSudoku(sudokuBoard);
        } else {
            System.out.println("No solution exists.");
        }
    }

}
