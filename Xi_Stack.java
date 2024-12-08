import java.util.*;
// public class Xi_Stack {
//     // static class stack {
//     //     static ArrayList<Integer> list = new ArrayList<>();
//     //     public static boolean isempty(){
//     //         return list.size() == 0;
//     //     }

//     //     public static void push(int data){
//     //         list.add(data);
//     //     }


//     //     public static int pop(){
//     //         if (isempty()) {
//     //             return -1;
                
//     //         }
//     //         int top = list.get(list.size()-1);
//     //         list.remove(list.size()-1);
//     //         return top;
//     //     }

//     //     public static int peek(){
//     //          if (isempty()) {
//     //             return -1;
                
//     //         }
//     //         return list.get(list.size()-1);
//     //     }
    
        
//     // }

//     // public static void main(String[] args) {
//     //     stack s = new stack();
//     //     s.push(1);
//     //     s.push(2);
//     //     s.push(3);

//     //     while (!s.isempty()) {
//     //         System.out.println(s.peek());
//     //         s.pop();
            
//     //     }
//     // }

// }













import java.util.LinkedList;

 public class Xi_Stack {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class Stack {
//         Node head = null;

//         public boolean isEmpty() {
//             return head == null;
//         }

//         public void push(int data) {
//             Node newNode = new Node(data);

//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             return head.data;
//         }
//     }

    public static void main(String[] args) {
        // Stack s = new Stack();
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
