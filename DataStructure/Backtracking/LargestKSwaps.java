public class LargestKSwaps {

    public static void main(String[] args) {
        String s="778837";
    //output --> 7654321


        int k = 2;

        System.out.println(findMaxRecursion(s, k));

    }

    //using recursion

    static String findMaxRecursion(String s,int k){
        if(k==0) return s;


        int n= s.length();
        String ans = s;

        //iteratiin through all charcters

        for(int i =0;i<n-1;i++){
            for(int j = i+1;j<n;j++){

                //swap only if(s[j]>s[i])
                if(s.charAt(i)<s.charAt(j)){
                    s= swap(s, i, j);
                    String recResult = findMaxRecursion(s,k-1);
                    if(recResult.compareTo(ans)>0){
                        ans= recResult;
                    }
                    s= swap(s,i,j);
                }
            }
        }
        return ans;
    }
    /*
     * Tc--.(O(n^2))
     * For each Recusion (O(n^2) OPERATION PERFORMED and there re k levels of recursion)
     * Auciiiayr space: O(k) for the recursion statk
     * 
     */


    static String swap(String s, int i ,int j){
        char []arr= s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }


    static void solve(char[]s, int k , char[]result,int start){
        
    }
        
}
