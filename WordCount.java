import java.util.Scanner;
public class WordCount {
    public static int wordCount(String str){
        int ct=0;
        int i = 0;
        while(i<str.length()){
            if( str.charAt(i) == ' '){
                i++;
                ct++;
            }
            i++;
        }

        return ct+1;
    }
    public static int wordsplit(String str){
        String sep[] = str.split(" ");
        return sep.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "My name is Poonam Biswas.";
        int count = wordCount(str);
        System.out.println(count);
        System.out.println("Word split");
        int ct = wordsplit(str);
        System.out.println(ct);

    }
}
