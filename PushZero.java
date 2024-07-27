import java.util.Scanner;
public class PushZero {

    public static int[] createArray(int cap){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[cap];
        for(int i=0; i<cap; i++){
            System.out.println("Enter elemnt for array at "+i+"pos : ");
            int ele = sc.nextInt();
            arr[i]=ele;
        }
        return arr;
    }
    public static void swap(int arr[], int nz, int z){
        int temp = arr[nz];
        arr[nz] = arr[z];
        arr[z] = temp;
        return;
    }
    public static void pushZero(int arr[]){
        int z = 0;
        int nz= 0;
        
        while(z<arr.length){
            if(arr[z]!=0){
                swap(arr,z, nz);
                nz++;
            }
            z++;
        }
    }
    public static void printArray(int A[]){
        for (int i:A){
            System.out.print(i+",");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter capacity : ");
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        int A[] = createArray(cap);
        printArray(A);
        System.out.println();
        pushZero(A);
        System.out.println();
        printArray(A);
    }
}
