import java.util.Scanner;
public class CheckPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i<n; i++){
            if(n%i==0){
                isPrime = true;
                break;
            }
        }
        if(isPrime ==false){
            System.out.println(n+" is Prime");
        }
        else{
            System.out.println(n+" is not prime.");

        }
        sc.close();
    }
}