import java.util.*;


public class calculator {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number a : ");
    int a = sc.nextInt();
    System.out.println("Enter number b : ");
    int b = sc.nextInt();
    System.out.println("Enter operator");
    char operator = sc.next().charAt(0);

    switch (operator) {
        case '+': System.out.println(a+b);
            
            break;
            case '-': System.out.println(a-b);
            
            break;
            case '*': System.out.println(a*b);
            
            break;
            case '/': System.out.println(a/b);
            
            break;
            case '%': System.out.println(a%b);
            
            break;
            case '^': System.out.println(a^a);
            
            break;
            
    
        default: System.out.println("The Calculator ic not Advance.");
            break;
    }
    }
}