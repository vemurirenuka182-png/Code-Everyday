package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int prod = 1;
        while(n != 0) {
            int dig = n % 10;
            prod = prod * dig;
            n /= 10;
        }
        System.out.println("Product of given digits in a number : "+prod);
        sc.close();
    }
}
