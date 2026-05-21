package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0) {
            int dig = n % 10;
            sum += dig;
            n /= 10;
        }
        System.out.println("Sum of the digits in a number : "+sum);
        sc.close();
    }
}
