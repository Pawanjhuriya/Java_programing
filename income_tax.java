import java.util.Scanner;


public class income_tax {
    public static void main(String[] args){

        
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int income_tax;
    if(income<=500000){
        income_tax = 0;
    }
    else if(income > 500000 && income < 1000000 ){
     income_tax = (int) (income * 0.2);
    }
    else { 
     income_tax = (int) (income * 0.3);
    }
    System.out.println("Your income tax is :" + income_tax);
  }
}
