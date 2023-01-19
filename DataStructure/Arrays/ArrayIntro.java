package Arrays;

public class ArrayIntro{
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0]=66;   //will return the value of first number present in arrray because array start from 0 1 2 .....n
        arr[1]=20;
        if(arr[0] > arr[1]){
            System.out.println(arr[0]);
        }else{
            System.out.println(arr[1]);
        }
        System.out.println(arr[0] +arr[1]);


        // int arr[]={1 ,2 ,3 ,4, 5};
        // System.out.println(arr[0]);
    }
}