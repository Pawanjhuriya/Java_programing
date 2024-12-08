public class Xbquicksort {
    public static void printarr(int arr[], int i){
        for(i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println();
    }



    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 10, 1, 2, 3, 4};   
        printarr(arr, 0);
    }
}
