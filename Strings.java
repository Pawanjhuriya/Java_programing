import java.util.*;

// import javax.lang.model.util.SimpleTypeVisitor7;
public class Strings {
//     public static void main(String[] args) {
//         char arr[] = {'a','b','c','d',};
//         String str = "abcd";
//         String str2 = new String("xyz");
//         Scanner sc = new Scanner(System.in);
//         String name;
//         name = sc.nextLine();
//         System.out.println(name);
//         System.out.println(str);
//         System.out.println(str2);
//         System.out.println(arr);
//     }

    public static boolean ispalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }

        }
        return true;
    }
    public static float getsortpath(String path) {
        int X = 0, Y = 0;
        for(int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                Y--;
            }
            else if(dir == 'N'){
                Y++;
            }
            else if(dir == 'W'){
                X--;
            }
            else {
                X++;
            }
        }
        int x2 = X*X;
        int y2 = Y*Y;
        return (float)Math.sqrt(x2+y2);
        
    }
    public static void main(String[] args) {
        //String str = "noon";
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        //System.out.println(ispalindrome(str));
        System.out.println(getsortpath(path));
    }


    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    // public static void main(String[] args) {
        // String fruits[] = {"apple", " mango", "banana"};
        // // System.out.println(subString(str, 0, 10));
        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);
    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch = 'A'; ch <='Z'; ch++){
    //         sb.append(ch);
    //     }
    //     System.out.println(sb);
    // }



public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i = 1; i<str.length(); i++){
        if(str.charAt(i) == ' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
//    public static void main(String[] args) {
//  String str = "hi, i am pawan";
//  System.out.println(toUpperCase(str));
// }

}
 








