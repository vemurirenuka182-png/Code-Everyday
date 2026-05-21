package Patterns;
import java.util.*;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i*j < 10) {
                    System.out.print(" "+i*j+" ");
                }
                else {
                    System.out.print(i*j+" ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}
