import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            int col=1;
            while(col<=n){
                char printchar = (char)('A' + col-1);
                System.out.print(printchar);
                col++;
            }
            System.out.println();
        }
    }
}
