// package Arrays.Problems;

public class secondlargest {
    public static void main(String[] args) {
        int arr[]= {1,2,5,6,3,4};
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int[]arr){
        int n = arr.length;
        int temp;

        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-2];
    }
    
}
