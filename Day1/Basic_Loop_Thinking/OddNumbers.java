package Logic_Building.Basic_Loop_Thinking;

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("Odd Numbers are : ");
        for(int i=1;i<=10;i++) {
            if(i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
