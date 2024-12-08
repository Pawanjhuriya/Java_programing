// import java.util.LinkedList;
// public class XhFramelinkedlist {
//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<>();

//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(0);


//         System.out.println(ll);

//         ll.removeLast();
//         ll.removeFirst();

//         System.out.println(ll);
//     }
// }






public class XhFramelinkedlist {

    
    public static void subarray(int number[]){
        int sum = 3;
        int count = 0;
        
        for(int i = 0; i < number.length; i++){
            
            int curr = number[i];
            for(int j= i; j<number.length; j++){
                System.out.print("("+ curr + "," + number[j]+")");
                if(curr+number[j] == sum){
                    count++;
                    
                }   
            }
            System.out.println();
        }

        
        System.out.println("sum is match : "+count);
        
        
    }
    
    public static void main(String[] args) {
        int number[] = {1, 2, 1, 1, 1};
        
        subarray(number);
        // System.out.println();

        
    }
}
