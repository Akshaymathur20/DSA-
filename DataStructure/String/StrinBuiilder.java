// package DataStructure.String;

import java.util.*;

public class StrinBuiilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Akshay");

        System.out.println(sb);

        //char at index 0;

        System.out.println(sb.charAt(0));

        //set char st index 0;
        sb.setCharAt(0, 'a');
        System.out.println(sb);

        sb.insert(0, 'A');
        System.out.println(sb);
    }
    
}
