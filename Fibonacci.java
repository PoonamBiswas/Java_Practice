import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series range : ");
        int ct = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " " );
        int sum = 0;
        while((ct-2)>0){
            sum = a+b;
            a = b;
            System.out.print(sum + " ");
            b = sum;
            ct--;
        }
    }
    
}
