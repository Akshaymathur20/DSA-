import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Permutation {


    //We are using hashset to just to avoid duplicate 
    //we can also use List to take the duplicates
    public static void main(String[] args) {
        String s = "abc";
       

        //  Set<String> result = new HashSet<>();
      
        // permutationRecursion(s, "",result );
        // System.out.println("Permutation of " + s + " " + result);


        //answe of backtraknig
        System.out.println();

        HashSet<String> ans = new HashSet<>();

        permutationBackTrackingDebug(s.toCharArray(), 0, ans);

        // System.out.println("Permutation by BackTracking "+s + " "+ ans);


        //permutation of a nubmer
        System.out.println();

        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        permutationNumberRecursion(arr, new ArrayList<>(), result);
 
        System.out.println();
        ArrayList<ArrayList<Integer>>answer = new ArrayList<>();

        boolean used[]= new boolean[arr.length];
        permutationNumberBacktraccking(arr, new ArrayList<>(), answer, used);
        System.out.println("Permutations: " + result);
        System.out.println("Permutations: " + answer);




    }


    static void permutationRecursion(String input, String output,Set<String>result){
           
        //base condition

        if(input.length()==0){
            result.add(output);
            return;
        }

        for(int i =0;i<input.length();i++){

            String newInput = input.substring(0,i)+ input.substring(i+1);
            String newOutput = output + input.charAt(i);

            permutationRecursion(newInput, newOutput, result);

        }
    }



    static void permutationBackTracking(char[]input, int start, HashSet<String>result){

        //base condition
        if(start==input.length){

            result.add(new String(input));
            return;
        }


        for(int i =start;i<input.length;i++){

              swap(input,i,start);
              permutationBackTracking(input, i+1, result);
              swap(input,i,start);
        }
    }

    //Debuggin perception
    static void permutationBackTrackingDebug(char[]input, int start, HashSet<String>result){

        //base condition
        if(start==input.length){
           
            System.out.println("Adding: " + new String(input));
            result.add(new String(input));
            return;
        }


        for(int i =start;i<input.length;i++){
            
            System.out.println("Swapping: " + input[start]+ " <-> " + input[i]+ " | Before: " + new String(input));
              swap(input,i,start);  //swaping characters

              System.out.println("After swap: "+ new String(input));
              permutationBackTracking(input, start+1, result);
              swap(input,i,start); //backtrack

              System.out.println("BackTracked: "+ new String(input));
        }
    }

    
    


    static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }



    //Now of a nubmer 
    //Normal recursion pass by value
    
    static void permutationNumberRecursion(int arr[], ArrayList<Integer>list,ArrayList<ArrayList<Integer>> result){
           
        //base condition

        if(list.size()==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
           
        for(int a:arr){
            if(list.contains(a)){
                continue;  //skipping duplicates
            }
            ArrayList<Integer> newList= new ArrayList<>(list);
            newList.add(a);
            permutationNumberRecursion(arr,newList, result);
        }

    

        }

        static void permutationNumberBacktraccking1(int arr[], ArrayList<Integer>list,ArrayList<ArrayList<Integer>> result){
           
            //base condition
    
            if(list.size()==arr.length){
                result.add(new ArrayList<>(list));
                return;
            }
               
            for(int i =0;i<arr.length;i++){
                if(list.contains(arr[i])) continue;

                list.add(arr[i]);
                permutationNumberBacktraccking(arr, list, result, used);
                list.remove(list.size()-1);
            }

            }

            //we can more opitmise it by below method


    static void permutationNumberBacktraccking(int arr[], ArrayList<Integer>list,ArrayList<ArrayList<Integer>> result,boolean[] used){
           
        //base condition

        if(list.size()==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
           
        for(int i =0;i<arr.length;i++){
            if(used[i]) continue;

            used[i]=true;
            list.add(arr[i]);
            permutationNumberBacktraccking(arr, list, result, used);

            used[i]=false;
            list.remove(list.size()-1);
        }

    

        }

        /*
 Why is used[] Faster?
✅ O(1) lookup: Checking used[i] takes O(1), whereas list.contains(nums[i]) takes O(N) in the worst case.
✅ Avoids redundant checks: Since used[] directly tracks which elements are used, it doesn’t scan the list.
✅ More optimal for larger inputs: As input size increases, avoiding contains() significantly improves speed.

🆚 Comparing Both Backtracking Approaches
Feature	With used[] (Your New Code)	With list.contains() (Old Code)
Lookup Time Complexity	✅ O(1) (Array Indexing)	❌ O(N) (List Scanning)
Memory Usage	✅ Extra boolean[] (O(N))	✅ No extra space (O(1))
Performance	✅ Faster for large inputs	❌ Slower due to contains()
         */

        /*
         * 
Feature	           Without Backtracking	         With Backtracking
Memory Usage	  High (New list at every step)	 Low (Modifies in-place)
Performance    	Slower due to list creation	      Faster due to in-place modification         
Time Complexity   O(N!*N)                         O(N!)
BestFor            Small INput                    Large INput

    
More efficient (Avoids creating unnecessary copies).
Less memory usage (Uses a boolean[] instead of new lists).
Scales better for larger inputs.

*/
    
}
