import java.util.Scanner;
public class ArrayCC {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("pys : " + marks[0]);
         System.out.println("che : " + marks[1]);
          System.out.println("math : " + marks[2]);

          marks[2] = 100;
           System.out.println("math : " + marks[2]);


        
    }


    
}