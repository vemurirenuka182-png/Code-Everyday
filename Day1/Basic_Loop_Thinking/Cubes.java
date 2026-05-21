package Logic_Building.Basic_Loop_Thinking;
import java.util.*;
public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of numbers");
        int n = sc.nextInt();
        System.out.println("cubes of Numbers");
        for(int i=1;i<=n;i++) {
            System.out.print(i*i*i+" ");
        }
        sc.close();

    }
}
