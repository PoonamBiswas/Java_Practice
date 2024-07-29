import java.util.Scanner;

public class ReverseString {
    public static String reverse (String str) {
        int i = str.length()-1;
        String rev = "";
        while (i>=0){
        char ch = str.charAt(i);
        rev = rev+ch;
        i--;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to reverse : ");
        String str = sc.nextLine();
        String rev = reverse(str);
        System.out.println(" Reversed String : ");
        System.out.println(rev);

    }
}
