import java.util.Scanner;
public class UpdataArray {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println(str);

        int input = sc.nextInt();
        return input;
    }
    public static void printArray(int A[]){
        for(int i:A){
            System.out.print(i + ",");
        }
    }
    public static void updatedArray(int A[], int key, int update){
        for(int i = 0; i<A.length; i++){
            if(A[i]==key){
                A[i]=update;
                return;
            }
        }
        System.out.println("Key not found in Array ");
    }

    public static void main(String[] args) {
        int cap = takeInput("Enter array capacity : ");
        int A[] = new int[cap];
        for(int i = 0; i<cap; i++){
            A[i] = takeInput("Enter elements : ");
        }
        printArray(A);
        int key = takeInput("Elemnet you want to replace : ");
        int update = takeInput("Enter updated value : ");
        updatedArray(A, key, update);
        printArray(A);


    }

}
