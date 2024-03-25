// package DataStructure.SlidingWindow.Fixed;

import java.util.Arrays;
import java.util.HashMap;

public class _03CountAnagram {

public static void main(String[] args) {
    
    String text = "aabaabaa";
    String pattern= "aaba";

  System.out.println(CountOccurence(text, pattern));
  System.out.println(countOccurence(text, pattern));
}

//Brute force approach

static int CountOccurence(String t, String p){

    int m= t.length();
    int n= p.length();

    int ans =0;

    for(int i=0;i<=m-n;i++){
        String s= t.substring(i,i+n);

        if(Anagram(p,s)){
            ans++;
        }
    }
    return ans;

}

  static boolean Anagram(String s, String s1){

    char [] ch1 = s.toCharArray();
    char[] ch2 = s1.toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    return Arrays.equals(ch1, ch2);
  }

  static int countOccurence(String t, String p){
          
    HashMap<Character,Integer> map= new HashMap<>();

    for(char i:p.toCharArray()){
      map.put(i,map.getOrDefault(i, 0)+1);

    }

    int k = p.length();
    int n= t.length();

    int count = map.size();
    int ans =0;

    int i=0,j=0;
    while(j<n){
      int windowSize = j-i+1;

      if(map.containsKey(t.charAt(i))){
        map.put(t.charAt(j),map.get(t.charAt(j))-1);
        if(map.get(t.charAt(j))==0){
          count--;
        }
      }
      if(windowSize<k){
        j++;
      }
      else if(windowSize==k){
        if(count==0){
          ans++;
        }
        if(map.containsKey(t.charAt(i))){
               map.put(t.charAt(j),map.get(t.charAt(j))+1);
              if(map.get(t.charAt(j))==1){
                count++;
              }
        }
        i++;
        j++;
      }
    }
    return ans;

  }
    
}
