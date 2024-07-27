import java.util.*;

public class RotateArray {
    public static void rotateArray(int arr[], int r){
        int n = arr.length;
        int i =0;
        int rotated[]= new int[n];
        while(i<n){
            rotated[(i+r)%n] = arr[i];
            i++;
        }
        for(int j : rotated){
            System.out.print(j + ",");
        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rotation");
        int r = sc.nextInt();
        
        for(int i : arr){
            System.out.print(i + ",");
        }
        System.out.println();
        rotateArray(arr,r);

    }
}
