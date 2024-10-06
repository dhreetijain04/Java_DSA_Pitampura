package WEEK10;

public class Nqueens {
    static int[][] board;
    static void display(int[][] board){
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j <board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    //recursive fun
    static boolean nQueens(int[][] board, int i, int n){
        if(i==n){
            //display
            display(board);
            return false;
        }

        for(int j=0;j<n;j++){
            if(check(board, i, j, n)){
                board[i][j]=1;
                if(nQueens(board, i+1, n))
                    return true;
                //backtrack
                board[i][j]=0;
            }
        }
        return false;
    }
    //check fun
    static boolean check(int[][] board,int i,int j,int n){
        //column
        for(int k=0;k<i;k++){
            if(board[k][j]==1){
                return false;
            }
        }
            //left diagonal
            int x=i-1,y=j-1;
            while(x>=0 && y>=0){
                if(board[x--][y--]==1){
                    return false;
                }
            }
            //right d
             x=i-1;y=j+1;
             while(x>=0 && y<n){
                if(board[x--][y++]==1){
                    return false;
                }
             }
             return true;
        }
    
    public static void main(String[] args) {
        int n=4;
        board=new int[n][n];
        nQueens(board,0,n);

    }
}
