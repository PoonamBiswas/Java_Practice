import java.util.Scanner;
public class IsoscelesTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            for(int space = 1; space<=n-row;space++){
                System.out.print(" ");
            }
            for (int inc = 1; inc<=row; inc++){
                System.out.print(inc);
            }
            for(int dec = row-1; dec>=1; dec--){
                System.out.print(dec);
            }
            System.out.println();
        }
    }
}
