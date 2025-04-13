/*
   https://leetcode.com/problems/majority-element/description/
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement{
    public static void main(String[] args) {
        int arr[]= {3,2,3,4,3,5,7,3,3}; //n = 5  
    
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement1(arr));
        System.out.println(majorityElement2(arr));
        System.out.println(majorElement3(arr));


        int[] nums = {11,22,33,11};
        // List<Integer> ans = majorElementFollowUp(nums);
        List<Integer> ans = majorElementFollowUp2(nums);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    //brute force

    static int majorityElement(int nums[]){
        int n= nums.length;

        //3 2 3 4 3   count =3

        int count =0;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
        

        if (count>n/2) {
            return nums[i];
        }
    }

        }

        return -1;
    }


    //better the choice

    static int majorityElement1(int nums[]){

        int n= nums.length;
 
        HashMap<Integer,Integer> map = new HashMap<>();

        //here were stroing the values with its occurence
        for (int i = 0; i < nums.length; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return -1;
    }

    /*
     * Time Complexity: O(N*logN) + O(N), where N = size of the given array.
Reason: We are using a map data structure. Insertion in the map takes logN time. And we are doing it for N elements. So, it results in the first term O(N*logN). The second O(N) is for checking which element occurs more than floor(N/2) times. If we use unordered_map instead, the first term will be O(N) for the best and average case and for the worst case, it will be O(N2).
     */



     //optimval approach would moore's voting alorithms

    static int majorityElement2(int nums[]){

        int n= nums.length;

        int majorElement = nums[0];
        int count =1;

        for(int i =1;i<n;i++){
            if(count==0){
               majorElement = nums[i];
               count=1;
            }else if(nums[i]==majorElement){
                count++;
            }else{
                count--;
            }
        }

        return majorElement;
        
    }

    static int majorElement3(int nums[]){
        int n= nums.length;

        int majorityEle = 0;
        int count =0;

        for(int num:nums){
            if(count==0){
                majorityEle=num;
            }
            if(num==majorityEle){
                count++;
            }else{
                count--;
            }
        }
        return majorityEle;
    }


    //

    static ArrayList<Integer> majorElementFollowUp(int nums[]){
        int len = nums.length;

        ArrayList<Integer> ans= new ArrayList<>();
        int count =0;

        for(int i =0;i<len;i++){

            if(ans.size()==0 || ans.get(0)!=nums[i]){
                for(int j=0;j<len;j++){
                   if (nums[j]==nums[i]) {
                    count++;
                    
                   }
                }
                if(count>len/3){
                    ans.add(nums[i]);
                }
            }
            if(ans.size()==2) break;
        }
        return ans;
    }

    static ArrayList<Integer> majorElementFollowUp1(int nums[]){
        int n= nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        int minn = (int)(n/3)+1; //lease occurence

        for(int i =0;i<n;i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i],value+1);

            if(map.get(nums[i])==minn){
                list.add(nums[i]);
            }
            if (list.size()==2) {
                break;
            }
        }
        return list;
    }

    //opitmval approach

    static ArrayList<Integer> majorElementFollowUp2(int nums[]){
        int n= nums.length;

        ArrayList<Integer> list =new ArrayList<>();

        int maj1= Integer.MIN_VALUE;
        int maj2= Integer.MIN_VALUE;

        int count1=0;
        int count2=0;

        for(int num:nums){
            if(num==maj1){
                count1++;
            }else if(num==maj2){
                count2++;
            }else if(count1==0){
                 maj1=num;
                 count1=1;
            }else if(count2==0){
                maj2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }

        int freq1=0;
        int freq2=0;

        for(int num:nums){
            if(num==maj1){
                freq1++;
            }else if(num==maj2){
                freq2++;
            }
        }

        if(freq1>n/3){
            list.add(freq1);
        }
        if(freq2>n/3){
            list.add(freq2);
        }
        return list;
    }

}