import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range for sum of first n natural numbers : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i =1; i<=num ; i++){
            sum = sum+i;
        }
        sc.close();
        System.out.println("Sum of first "+num+" natural numbers is " + sum);
    }
}