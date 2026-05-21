package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class Sum_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of numbers");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        System.out.println("Sum upto the given range : "+sum);
        sc.close();
    }
}
