import java.util.Scanner;

public class Recurrsion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // public static void main(String[] args) {
    //     int n = 10;
    //     printDec(n);

    // }

    public static void printIns(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printIns(n + 1);
    }
    // public static void main(String[] args) {
    // int n = 1;
    // printIns(n);

    // }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * fact(n - 1);
        return fn;

    }

    // public static void main(String[] args) {
    // int n = 5;
    // System.out.println(fact(n));
    // }

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = Sum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    // public static void main(String[] args) {
    // int n = 5;
    // System.out.println(Sum(n));
    // // sum(n);
    // }

    // public static void main(int n){
    // if()
    // }
    // public static void main(String[] args) {

    // }

    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    // public static void main(String[] args) {
    // int arr[] = {1, 2, 5, 4, 5};
    // System.out.println(issorted(arr, 0));
    // }

    public static int firstoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstoccurence(arr, key, i + 1);
    }

    // public static void main(String[] args) {
    // // Scanner sc = new Scanner(System.in);
    // // int length = sc.nextInt();
    // int arr[]= {1 , 2, 3, 4, 5, 6, 7, 7};
    // System.out.println(firstoccurence(arr, 5, 0));
    // }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // public static void main(String[] args) {
    // System.out.println(power(2, 3));
    // }

    public static int optimizepower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizepower(x, n / 2) * optimizepower(x, n / 2);

        if (n % 2 != 0) {
            return x * halfpower;
        }
        return halfpower;
    }

    // public static void main(String[] args) {
    // int x = 2;
    // int n = 3;
    // System.out.println(optimizepower(x, n));
    // }

    public static int tilleproblem(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }

        // vertical
        int fnm1 = tilleproblem(n - 1);
        // horizotal
        int fnm2 = tilleproblem(n - 2);

        int totways = fnm1 + fnm2;
        return totways;
    }

    // public static void main(String[] args) {
    // System.out.println(tilleproblem(2));
    // }

    public static void removeduplicate(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeduplicate(str, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            removeduplicate(str, idx + 1, newstr.append(currChar), map);
        }

    }
    // public static void main(String[] args) {
    // String str = "ppaawwaanjjhhuurriyyaa";
    // removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
    // }

    public static int friendpairs(int n) {
        if (n == 1 | n == 2) {
            return n;
        }
        // choice
        int fnm1 = friendpairs(n - 1);
        // pairs
        int fnm2 = friendpairs(n - 2);
        int pairways = (n - 1) * fnm2;
        int totways = fnm1 + pairways;
        return totways;
    }

    // public static void main(String[] args) {
    // System.out.println(friendpairs(10));
    // }

    public static void printbinstring(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printbinstring(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printbinstring(n - 1, 1, str + "1");
        }
    }

    // public static void main(String[] args) {
    // printbinstring(5, 0, "");
    // }
}
