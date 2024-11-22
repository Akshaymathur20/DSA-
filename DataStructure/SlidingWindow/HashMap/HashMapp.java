// package SlidingWindow.HashMap;

import java.util.HashMap;
import java.util.Map;
public class HashMapp {
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap();

      map.put("Akshay", 10);
      map.put("Arpit", 20);
      map.put("VInod", 30);
      map.put("Shubham", 40);

      System.out.println("Size of the map is : " + map.size());

      System.out.println(map);

       if(map.containsKey("Akshay")){
               
        Integer a = map.get("Akshay");

        System.out.println("value for key for  ' vishal ' is : "+ a);


       }

    //    System.out.println(map.get("Arpit"));
   
        // map.remove("Shubham");

        // System.out.println(map.containsKey("Shubham"));



        for(Map.Entry<String,Integer> e:map.entrySet()){

            System.out.println("Key: "+e.getKey()+ "  Value : "+e.getValue());
        }
    }
}
