public class SecondLargest{
    public static int seclar(int arr[]){
        int max1 = arr[0];
        int max2= arr[0];
        for(int i:arr){
            if(i>max1){
                max2=max1;
                max1=i;
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int []arr = {1 ,4, 56 ,34 ,21 ,3333,53,234342,43523};
        int seclargest = seclar(arr);
        System.out.println(seclargest);

    }
}