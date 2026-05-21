package Patterns;
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows : ");
        int n = sc.nextInt();
        int k = 1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(k < 10) {
                    System.out.print(" "+k+" ");
                }
                else {
                    System.out.print(k+" ");
                }
                k++;
            }
            System.out.println();
            sc.close();
        }
    }
}
