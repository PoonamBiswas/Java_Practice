import java.util.Scanner;
public class Insertion_Array {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);

        int input =sc.nextInt();
        return input;

    }
    public static int insert(int A[], int ele, int pos, int size){
        for(int i = size; i>pos; i--){
            A[i] = A[i-1];
        }
        A[pos] = ele;
        size++;
        return size;
    }
    public static void main(String[] args) {
        int cap = takeInput("Enter the capacity for the ARRAY : ");
        int size = takeInput("Enter size of array : ");
        int []A = new int[cap];
        for(int i = 0; i<size; i++){
            A[i] = takeInput("Enter element "+i+"at index : " );
        }
            int ele = takeInput("Enter Elemnt : ") ;
            int pos = takeInput("Enter Position of elemnt : ");
            size = insert(A, ele, pos, size);
        for(int j:A){
            System.out.print(j + " , ");
        }
        
    }
}
