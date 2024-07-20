
import java.util.Scanner;
public class RevPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            int num = 0;
            num = n-row+1;
			for(int col = 1; col<=row; col++){
                System.out.print(num);
                num=num+1;
			}
			System.out.println();
			}
    }
}
