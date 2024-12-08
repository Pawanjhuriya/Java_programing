import java.util.Scanner;

public class function {
    // public static void printhellowworld() {
    // System.out.println("hellow world");
    // }
    // public static void swap(int a, int b){
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("a =" + a);
    // System.out.println("b =" + b);

    // }
    // public static int factorial(int n){
    // int f = 1;
    // for(int i = 1; i<=n; i++){
    // f = f * i;
    // }
    // return f;
    // }
    // public static int bincoeff(int n, int r){
    // int fect_n = factorial(n);
    // int fect_r = factorial(r);
    // int fect_nmr = factorial(n-r);
    // int bincoeff = fect_n/fect_r*fect_nmr;
    // return bincoeff;

    // }
    // public static boolean isprime(int n){
    // if(n == 2){
    // return true;
    // }
    // for(int i =2; i<=Math.sqrt(n); i++){
    // if(n % i == 0){
    // return false;
    // }

    // }
    // return true;
    // }
    // public static void primeInRange(int n){
    // for(int i = 2; i<=n; i++){
    // if(isprime(i)){ //ture
    // System.out.println(i+ " ");
    // }
    // }
    // System.out.println();
    // }
    // public static void binToDec(int binnum){
    // int pow = 0;
    // int decnum = 0;
    // while(binnum > 0){
    // int lastdigit = binnum%10;
    // decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
    // pow++;

    // //binnum = binnum/10;

    // }
    // System.out.println("decimal of " + binnum + " = " + decnum);

    // }

    public static void hollow_rectangle(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) {

            for (int j = 1; j <= totcols; j++) {

                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // public static void main(String[] args) {
    // int totrows = 5; // Example number of rows
    // int totcols = 10; // Example number of columns

    // hollow_rectangle(totrows, totcols);
    // }

    public static void inverted_half_piramid() {
        int n = 10;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                // space
                // for(int j = 1; j<=n-i; j++){
                // System.out.print(" ");
                System.out.print(j + 1 - i);
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    // inverted_half_piramid();
    // }

    public static void floydtriangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }

    // public static void main(String[] args) {
    // floydtriangle(4);
    // }

    // code butterrrfly

    public static void butterfly(int n) {
        // int counter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

    }

    // public static void main(String[] args) {
    // butterfly(4);
    // }

    // public static void rhombhus(int n){
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=(n-i); j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=n; j++){
    // System.out.print("*");

    // }
    // for(int j=1; j<=i; j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=i-1; j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=n; j++){
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // for(int i = n; i>=1; i--){
    // for(int j = 1; j<=(n-i); j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=n; j++){
    // System.out.print("*");
    // }
    // for(int j=1; j<=i; j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=i-1; j++){
    // System.out.print(" ");
    // }
    // for(int j=1; j<=n; j++){
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // }

    public static void hollow_rombhus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 | i == n | j == 1 | j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 | i == n | j == 1 | j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // rhombhus(n);
        hollow_rombhus(n);
    }
}
