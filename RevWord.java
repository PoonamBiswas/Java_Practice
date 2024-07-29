public class RevWord {

    public static String revword(String str) {
        System.out.println("In revword");
        String finalstr = "";
        int start = 0;
        int size = str.length() - 1;
        int i = 0;
        while (start <= size) {
            char ch = str.charAt(i);
            if (ch == ' ' || i == size) {
                int end = (i == size) ? i : i - 1;
                String revword = reverse(str, start, end);
                finalstr += revword + " ";
                start = i + 1;
            }
            i++;
        }
        return finalstr.trim(); // To remove the trailing space
    }

    public static String reverse(String str, int start, int end) {
        String rev = "";
        while (start <= end) {
            char ch = str.charAt(start);
            rev = ch + rev;
            start++;
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "Hi my name is Poonam.";
        String rev = revword(str);
        System.out.println(rev);
    }
}
