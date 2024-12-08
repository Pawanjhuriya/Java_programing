import java.util.LinkedList;

import org.w3c.dom.Node;

public class XfLinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index , int data){
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while (i < index-1) {
            temp = temp.next;
            i++;
            
        }
        newnNode.next=temp.next;
        temp.next = newnNode;
    }

    // remove first in LL

    // public int removefirst(){
    //     if(size == 0){
    //         System.out.println("LL is Empty");
    //     }else if (size == 1) {
    //         int val = head.data;
    //         head = tail = null;
    //         return val;
            
    //     }
    //     int val = head.data;
    //     head = head.next;
    //     return val;
    // }


    //remove last on LL
  public int removeLast() {
    
    if (size == 0) {
        System.out.println("LL is Empty");
    } 
    else if (size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0; // Update size to 0
        return val;
    } 

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
        
    
    
    }



    public int itrsearch(int key){
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
                
            }

            temp = temp.next;
            i++;
            
        }
        return -1;
    }

    public int hepler(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = hepler(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    
    public int recsaerch(int key){
        return hepler(head, key);
    }


    public void revers(){
        Node prev = null;
        Node curr = tail = head;
        Node next;


        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;

    }






    



    public static void main(String[] args) {
        XfLinkList ll = new XfLinkList();
        // int key = 4;
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 3);
        ll.print();
        ll.addFirst(0);
        ll.print();
        ll.addLast(6);
        ll.print();
        System.out.println(ll.size);
        // ll.removefirst();
        // ll.print();
        ll.removeLast();
        ll.print();
        // System.out.println("Key found at index : " + ll.itrsearch(4));
        System.out.println("Key found at index : " + ll.recsaerch(3));
        ll.revers();
        ll.print();
        
        
    }
}
