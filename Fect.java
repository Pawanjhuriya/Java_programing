import java.util.*;

public class Fect {
  int x = array.MAX_VALUE;

  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    int fn = n * fact(n - 1);
    return fn;
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
  }

}
