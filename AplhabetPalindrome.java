import java.util.Scanner;
public class AplhabetPalindrome {
    public static boolean palindrome(String str){
        int i = 0;
        int n = str.length() - 1;
        while (i <= n) {
            char str1 = str.charAt(i);
            char str2 = str.charAt(n);
            if (str1 != str2) {
                return false;
            }
            i++;
            n--;
            }
            return true;
        }
    public static void main(String[] args) {
        System.out.println("Enter word : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean check = palindrome(str);
        if(check){
            System.out.println(str + " is Palindrome");
        }
        else{
            System.out.println(str +" not Palindrome");
        }
    }
}
