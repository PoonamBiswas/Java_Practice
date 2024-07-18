import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomnum = random.nextInt(10);
        System.out.println(randomnum);
        int guess;
        do{
            System.out.println("Guess number within 1-10 : ");
            guess = sc.nextInt();
        }
        while(guess!=randomnum);
        sc.close();

    }
}
