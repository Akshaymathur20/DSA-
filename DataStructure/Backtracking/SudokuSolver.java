public class SudokuSolver {
    public static void main(String[] args) {
        

        // if(solve(board)){
        //     display(board);
        // }else{
        //     System.out.println("Cannot solve ");
        // }
    }


    static boolean solve(int[][]board){
        int n = board.length;
        int row =-1;
        int col=-1;

        boolean emptyLeft = true;

        //this is how we are re
        for(int i =0;i<n;i++){
            for(int  j =0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }

            //if you foundsome empty element in row , the break

            if(emptyLeft==false){
                break;
            }
        }
        if(emptyLeft==true){
            return true;
            //sudoku is solve
        }

        //backtrack
        for(int num =1;num<=9;num++){
            if(isSafe(board,row, col,num)){
                board[row][col]=num;
                if(solve(board)){
                    // display(board);
                    return true;
                }else{
                    board[row][col]=0;
                }
            }
        }
        return false;
    }


    private static void display(int[][]board){
        for(int[]row:board){
            for(int num:row){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board, int row, int col ,int num){
        //check the row

        for(int i=0;i<board.length;i++){

            if(board[row][col]==num){
                return false;
            }
        }

        //check the col

        for(int[]nums:board){
            if(nums[col]==num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowstart = row - row%sqrt;
        int colStart = col-col%sqrt;

        for(int r = rowstart;r<rowstart+sqrt;r++){
            for(int c=colStart ;c<colStart+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
    
}
