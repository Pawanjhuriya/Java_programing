import java.util.Scanner;

public class BitManipulation {
    //     public static void main(String[] args) {
    //     System.out.println(5 & 6);
    //     // And opretor (bit manipulation)
    //     System.out.println(5 | 6);
    //     // Or opretor (bit manipulation)
    //     System.out.println(5 ^ 6);
    //     // xor opretor (bit manipulation)
    //     System.out.println(5 << 2);
    //     // left shift opretor (bit manipulation)
    //     System.out.println(5 >> 6);
    //     // right shift opretor (bit manipulation)
    // }

    public static void OddandEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    // public static void main(String[] args) {
    // OddandEven(3);
    // OddandEven(2);
    // OddandEven(12);
    // }

    public static int getIthbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // public static void main(String[] args) {
    // System.out.println(getIthbit(10, 1));
    // }

    public static int setIthbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // public static void main(String[] args) {
    // System.out.println(setIthbit(10, 2));
    // }
    public static int clearIthbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // public static void main(String[] args) {
    // System.out.println(clearIthbit(10, 1));
    // }

    public static int Countsetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // public static void main(String[] args) {
    // System.out.println(Countsetbits(15));
    // }

    public static int fastexpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;

            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    // public static void main(String[] args) {
    // System.out.println(fastexpo(2, -2));
    // }

}
