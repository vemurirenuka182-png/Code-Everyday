package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n /= 10;
        }
        System.out.println("Reverse of a number : "+rev);
        sc.close();
    }
}
