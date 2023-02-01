// package Backtracking;

//ways to go from a to b;

import java.util.ArrayList;
public class Maze {
        public static void main(String[] args) {
            // System.out.println(count(3,3));
            // path(" ", 3, 3);
            // System.out.println(pathreturnDiagonal(" ", 3, 3));
        
            boolean[][] board =   {
                      {true,true,true},
                      {true,false,true},
                      {true,true,true},
            };
            pathrestriction(" ", board, 0, 0);
    
     }

     static int count(int r ,int c){
            if(r==1 || c==1){
                return 1;
            }

            int left = count(r-1,c);
            int right = count(r,c-1);


            return left+right;
     }

     static void path(String  p, int r, int c){
         if(r==1 && c==1){
            System.out.println(p);
            return;
         }

         if(r>1){
            path(p+ "D",r-1 ,c);
         }

         if(c>1){
            path(p+ "R",r ,c-1);
         }
     }

     static ArrayList<String> pathreturn(String  p, int r, int c){
         if(r==1 && c==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
           return ans;
         }

         ArrayList<String> ans = new ArrayList<>();

         if(r>1){
           ans.addAll(pathreturn(p+ "D",r-1 ,c));
         }

         if(c>1){
           ans.addAll(pathreturn(p+ "R",r ,c-1));
         }
         return ans;
     }

     static ArrayList<String> pathreturnDiagonal(String  p, int r, int c){
         if(r==1 && c==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
           return ans;
         }

         ArrayList<String> ans = new ArrayList<>();

         if(r>1){
           ans.addAll(pathreturnDiagonal(p+ "V",r-1 ,c));
         }

         if(c>1){
           ans.addAll(pathreturnDiagonal(p+ "H",r ,c-1));
         }
         if(r>1 && c>1){
            ans.addAll(pathreturnDiagonal(p+ "D",r-1,c-1));
         }
         return ans;
     }

     //Path restrictions 
     static void pathrestriction(String  p, boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
           System.out.println(p);
           return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1 ){
           pathrestriction(p+'D', maze, r+1, c);
        }

        if(c<maze[0].length-1 ){
           pathrestriction(p+'R', maze, r, c+1);
        }
    }
    
}
