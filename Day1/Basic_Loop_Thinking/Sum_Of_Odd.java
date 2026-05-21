package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class Sum_Of_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Odd Numbers Sum : "+sum);
        sc.close();
    }
}
