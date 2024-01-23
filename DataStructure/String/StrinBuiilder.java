// package DataStructure.String;

import java.util.*;

public class StrinBuiilder {

    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Akshay");

        // System.out.println(sb);

        // //char at index 0;

        // System.out.println(sb.charAt(0));

        // //set char st index 0;
        // sb.setCharAt(0, 'a');
        // System.out.println(sb);

        // sb.insert(0, 'A');
        // System.out.println(sb);

        // sb.delete(0, 1);
        // System.out.println(sb);

        StringBuilder  sb= new StringBuilder("A");

        sb.append('k');  //str=str+"k";
        sb.append('s');  //str= str+"s"; and so one till y
        sb.append('h');
        sb.append('a');
        sb.append('y');

        System.out.println(sb.length());

    }
    
}
