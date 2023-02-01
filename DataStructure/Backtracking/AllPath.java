import java.util.Arrays;

// package Backtracking;

public class AllPath {
  public static void main(String[] args) {
    boolean[][] board =   {
        {true,true,true},
        {true,true,true},
        {true,true,true},
};
// Backtracking(" ", board, 0, 0);

int [][]path = new int[board.length][board[0].length];
allPathPrint(" ", board, 0, 0, path, 1);
    
  }
  static void Backtracking(String  p, boolean[][] maze,int r, int c){
    if(r==maze.length-1 && c==maze[0].length-1){
       System.out.println(p);
       return;
    }

    int count =0;
    if(!maze[r][c]){
        return;
    }
  
    //i am coonsiiderg thi s block in my path
    maze[r][c]=false;


    if(r<maze.length-1 ){
       Backtracking(p+'D', maze, r+1, c);
    }

    if(c<maze[0].length-1 ){
        Backtracking(p+'R', maze, r, c+1);
    }

    if(r>0){
        Backtracking(p+'U', maze, r-1, c);
    }
    if(c>0){
        Backtracking(p+'L', maze, r, c-1);
    }

    //this line where the function  will be over 
    //so before the funciton gets remove, also remove the chagnes that were made by that function 
    maze[r][c]=true;
    
}

  static void allPathPrint(String  p, boolean[][] maze,int r, int c,int[][]path,int step){
    if(r==maze.length-1 && c==maze[0].length-1){
    //    System.out.println(p);
    path[r][c]= step;
    for(int[]arr:path){
        System.out.println(Arrays.toString(arr));
    }
    System.out.println(p);
    System.out.println();
       return;
    }

    int count =0;
    if(!maze[r][c]){
        return;
    }
  
    //i am coonsiiderg thi s block in my path
    maze[r][c]=false;

    path[r][c]= step;
    if(r<maze.length-1 ){
       allPathPrint(p+'D', maze, r+1, c,path,step+1);
    }

    if(c<maze[0].length-1 ){
        allPathPrint(p+'R', maze, r, c+1,path,step+1);
    }

    if(r>0){
        allPathPrint(p+'U', maze, r-1, c,path,step+1);
    }
    if(c>0){
        allPathPrint(p+'L', maze, r, c-1,path,step+1);
    }

    //this line where the function  will be over 
    //so before the funciton gets remove, also remove the chagnes that were made by that function 
    maze[r][c]=true;
    path[r][c]= 0;
    
}
    
}
