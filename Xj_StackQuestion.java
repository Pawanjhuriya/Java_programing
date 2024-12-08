import java.util.*;
public class Xj_StackQuestion {
    public static void pushatbottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
            
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    // public static void main(String[] args) {
    //     Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);
    //     s.push(5);

    //     pushatbottom(s, 0);
    //     while (!s.isEmpty()) {
    //         System.out.println(s.pop());
            
    //     }

    // }
    










    public static  String reverseString(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
            
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    // public static void main(String[] args) {
    //     String str = "PAWAN";
    //     String result = reverseString(str);
    //     System.out.println(result);
    // }











  
    public static void stockspan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currprize = stocks[i];
            while (!s.isEmpty() && currprize >= stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    // public static void main(String[] args) {
    //     int stocks[] = {100, 80, 60, 70, 60, 85, 100};
    //     int span[] = new int[stocks.length];
    //     stockspan(stocks, span);

    //     for (int i = 0; i < span.length; i++) {
    //         System.out.print(span[i] + " ");
    //     }



    




    
    
    
    
    // public static void main(String[] args) {
    //     int arr[] = {6, 8, 0, 1, 3};
    //     Stack<Integer> s = new Stack<>();
    //     int nxtgreater[] = new int[arr.length];


    //     for(int i = arr.length-1; i>=0; i--){
    //         while (!s.isEmpty() && arr[s.peek()]<= arr[i]) {
    //             s.pop();
                
    //         }

    //         if (s.isEmpty()) {
    //             nxtgreater[i] = -1;
                
    //         }else{
    //             nxtgreater[i] = arr[s.peek()];

    //         }

    //         s.push(i);
    //     }

    //     for(int i = 0; i<nxtgreater.length; i++){
    //         System.out.print(nxtgreater[i]+" ");
    //     }
    //     System.out.println();
    //   }












    public static void main(String[] args) {
        int arr[] = "(,{,[,],},)";
        Stack<Integer> s = new Stack<>();
        
    }









    
}












