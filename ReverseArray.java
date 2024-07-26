import java.util.Scanner;
public class ReverseArray {
   
    public static int[] createArray(int cap){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[cap];
        for(int i=0; i<cap; i++){
            System.out.println("Enter array element : ");
            int ele = sc.nextInt();
            A[i] = ele;
        }
        return A;
    }
    public static void printArray(int A[]){
        for(int i:A){
            System.out.print(i+" , ");
        }
    }
    public static void reverseArray(int A[]){
        int last  = A.length-1;
        int first = 0;
        while(first<=last){
            int temp = A[first];
            A[first] = A[last]; 
            A[last] = temp;
            first++;
            last--;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array capacity : ");
        int cap = sc.nextInt();
        int A[] = createArray(cap);
        System.out.print("Original Array : ");
        printArray(A);
        System.out.println();
        reverseArray(A);
        System.out.println();
        System.out.println("Reversed Array : ");
        printArray(A);
    }
}
