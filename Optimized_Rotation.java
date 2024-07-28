import java.util.Scanner;

public class Optimized_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length");
        int n = sc.nextInt();
        int arr[] = createArray(n);
        printArray(arr);
        System.out.println(" Enter Number of rotation : ");
        int r = sc.nextInt();
        optimizedRotation(arr, r);
        printArray(arr);

    }
    public static int[] createArray(int cap){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[cap];
        for(int i=0; i<cap; i++){
            System.out.println("Enter element for array at "+i+"pos : ");
            int ele = sc.nextInt();
            arr[i]=ele;
        }
        return arr;
    }

    public static void printArray(int A[]){
        for (int i:A){
            System.out.print(i+",");
        }
    }
    public static void reverseArray(int A[], int from, int to){
        int last  = to;
        int first = from;
        while(first<=last){
            int temp = A[first];
            A[first] = A[last]; 
            A[last] = temp;
            first++;
            last--;
        }
        return;
    }
    public static void optimizedRotation(int arr[], int r){
        reverseArray(arr, 0, arr.length-1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter direction : ");
        String dir = sc.nextLine();
        switch(dir){
            case "RIGHT":
                reverseArray(arr, 0, r-1);
                reverseArray(arr, r, arr.length-1);
                break;
            case "LEFT":
                reverseArray(arr, 0, arr.length-r-1);
                reverseArray(arr, arr.length-r, arr.length-1);
                break;
        }
        return;
    }
}
