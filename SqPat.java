import java.util.Scanner;
public class SqPat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For number patern with same number in a row.");
        int n = sc.nextInt();
        for(int row = 1; row<= n; row++){
            for (int col = 1; col<=n; col++){
                System.out.print(row);
            }
            System.out.println();
        }
        System.out.println("For number series patern");
        int a = sc.nextInt();
        for(int row1=1; row1<=a; row1++){
            for (int col1 = 1; col1<=a; col1++){
                System.out.print(col1);
            }
            System.out.println();
        }
    }
    
}
