
import java.util.Scanner;

public class Palindrom {

    public static boolean palindrome(String s){

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) == s.charAt(s.length()-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s = sc.next();
        System.out.print(palindrome(s));
        
    }
}
