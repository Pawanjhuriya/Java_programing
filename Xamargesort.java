public class Xamargesort {
    public static void printarr(int arr[], int i){
        for(i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println();
    }
    
    // si = star index | ei = ending index
    public static void mergesort(int arr[], int si, int ei){
    if((si >= ei)){
        return;
    }
    int mid = si+(ei-si)/2;
    mergesort(arr, si, mid);
    mergesort(arr, mid+1, ei);

    merge(arr, si ,mid , ei);

    }

    public static void merge(int arr[], int si ,int mid ,int ei){
        int temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
            }
            k++;
            
        }
        while (i<=mid) {
            temp[k++] = arr[i++]; 
            
        }
        while (j<=ei) {
        temp[k++] = arr[j++]; 
            
        }
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2 , 4 , 5 , 3, 5 ,3, 5, 3, 3, };
        mergesort(arr, 0, arr.length-1);
        printarr(arr, 0);
    }
}
