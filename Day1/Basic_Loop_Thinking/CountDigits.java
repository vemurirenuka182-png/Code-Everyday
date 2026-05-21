package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        while(n!=0) {
            int dig = n % 10;
            if(dig >= 0) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Count of Digits : "+count);
        sc.close();
    }
}
