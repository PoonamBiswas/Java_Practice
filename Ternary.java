import java.util.Scanner;
public class Ternary{
    public static void main (String srgs[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number : "); 
        int n1 = sc.nextInt();
        System.out.println("Enter number : "); 
        int n2 = sc.nextInt();
        int g1 = n1>n2? n1:n2;
        System.out.println(g1+"Is greater. ");
        
        System.out.println("Enter number : "); 
        int n11 = sc.nextInt();
        System.out.println("Enter number : "); 
        int n21 = sc.nextInt();
        System.out.println("Enter number : "); 
        int n31 = sc.nextInt();
        int g2 = n11>n21? (n11>n31? n11:n31) : (n21>n31? n21: n31);
        System.out.println(g2 + "Is greatest. ");
        sc.close();
    }
}