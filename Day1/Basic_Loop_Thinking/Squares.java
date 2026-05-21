package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Squares from 1 to n");
        for(int i=1;i<=n;i++) {
            System.out.print(i*i+" ");
        }
        sc.close();
    }
}

