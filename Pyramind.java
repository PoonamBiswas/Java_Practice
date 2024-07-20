import java.util.Scanner;
public class Pyramind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows : ");
        int n = sc.nextInt();
        sc.close();
        for(int row = 1; row<=n; row++){
            int spaces = n-row;
            for(int space = 0; space<=spaces; space++){
                System.out.print(" ");
                
            }
            for(int pat = 1; pat<=2*row-1; pat++ ){
                System.out.print(pat);
            }
            System.out.println();
        }
            
        }
    }