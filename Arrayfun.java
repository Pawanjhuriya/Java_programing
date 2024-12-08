import java.util.Scanner;

public class Arrayfun {
    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] - 10;
        }
    }
    // public static void main(String[] args) {
    // // int marks[] = { 95,96,97,};
    // Scanner sc = new Scanner(System.in);
    // int length = sc.nextInt();
    // int[] marks = new int[length];
    // System.out.println("Enter the all marks:");
    // for(int i=0; i<length; i++){
    // marks[i] = sc.nextInt();
    // }
    // System.out.println("Updated the all marks:");
    // update(marks);
    // for(int i=0; i<marks.length; i++){
    // System.out.println(marks[i] + " " );
    // }
    // System.out.println();
    // }

    public static int linearsearch(int numbers[], int key) {
        // int numbers[] = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // public static void main(String[] args) {
    // int numbers[] = {2, 3, 5, 6 , 7, 8, 13};
    // int key = 13;
    // int index = linearsearch(numbers, key);
    // if(index == -1){
    // System.out.println("NOT Found");
    // } else{
    // System.out.println("Key is at indax = " + index);
    // }

    // }

    public static int Getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest number is = " + smallest);
        return largest;
    }

    // public static void main(String[] args) {
    // int numbers[] = { 1, 3, 5, 50, 7, 100, 9 };
    // System.out.println("largest number is = " + Getlargest(numbers));
    // }

    public static void pairs(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {

            int curr = number[i];
            for (int j = i; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The Total Pairs is = " + tp);
    }

    // public static void main(String[] args) {
    // int number[] = { 1, 2, 1, 3, 5, 6 };
    // System.out.print("THE PAIRS = ");
    // pairs(number);
    // }

    public static void pairs1(int number[], int kg[]) {
        int tp = 0;
        for (int i = 0; i < kg.length; i++) {

            int curr = number[i];
            for (int j = i; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The Total Pairs is = " + tp);
    }

    // public static void main(String[] args) {
    // int number[] = { 1, 2, 1, 3, 5, 6 };
    // int kg[] = { 1, 2, 1, 3, 5, 6 };
    // System.out.print("THE PAIRS = ");
    // pairs1(price, kg);

    // }

    public static void subarray(int number[]) {
        for (int i = 3; i < number.length; i++) {
            // int start = i ;
            int start = 3;
            for (int j = 3; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    // int number[] = { 1, 2, 4, 5, 2, 6 };
    // System.out.println("The Subarray is = ");
    // subarray(number);
    // }

    public static void maxsubarraysum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, 3, 4, 5, 6 };
        maxsubarraysum(number);
    }

}