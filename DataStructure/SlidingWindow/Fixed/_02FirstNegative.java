// package DataStructure.SlidingWindow.Fixed;

import java.util.LinkedList;

public class _02FirstNegative {

    public static void main(String[] args) {
        int arr[]={12,-1,-7,8,-15,30,16,28};

        int k=2;
     solve(arr, k);
     System.out.println();
     FirstNegateive(arr, k);
    }

    //brute force apporach
    static void solve(int arr[],int k){

        int n = arr.length;

       boolean flag;

        for(int i=0;i<n-k+1;i++){
            flag = false;
            for(int j=0;j<k;j++){
                if(arr[i+j]<0){
                    System.out.print(arr[i+j]+" ");
                    flag = true;
                    break;
                }
            }
            if(!flag){
               System.out.print("0"+ " ");
            }
        }
       
    }

    //efficient appoach

    static void FirstNegateive(int nums[],int k){
        int n = nums.length;

        LinkedList<Integer> list = new LinkedList<>();

        int i =0,j=0;

        while(j<n){
            int windowSize = j-i+1;

            if(nums[j]<0){
                list.add(j);
            }

            if(windowSize<k){
                j++;
            }else if(windowSize==k){
                if(!list.isEmpty()){
                    System.out.print(nums[list.peek()]+" ");
                }else{
                    System.out.print("0"+" ");
                }

                while((!list.isEmpty()) && list.peek()<=i){
                    list.remove();
                }
              i++;
              j++;
            }
        }

    
    }
    
}
