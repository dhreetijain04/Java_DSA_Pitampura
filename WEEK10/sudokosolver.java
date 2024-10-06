package WEEK10;
import java.util.*;
public class sudokosolver {
    static boolean check(int[][] mat, int i, int j, int n, int num) {
    for (int x = 0; x < n; x++) {
        if (mat[i][x] == num || mat[x][j] == num) {
            return false;
        }
    }
    int b= mat.length;
    int root_b= (int)Math.sqrt(b);
    int ri= (i/root_b)*root_b;
    int rj= (j/root_b)*root_b;
    for(int x= ri; x<ri+root_b;x++){
        for(int y= rj; y<rj+root_b;y++){
            if(mat[x][y]==num){
                return false;
            }
        }
    }
    return true;
}
   static boolean sudoku(int[][] mat, int i, int j, int n){
    if(i==n){
        return true;
    }
    if(j==n){
        return sudoku(mat,i+1,0,n);
        
    }
    if(mat[i][j]!=0){
        return sudoku(mat,i,j+1,n);
    }
    for(int num=1;num<=9;num++){
        if(check(mat,i,j,n,num)){
            mat[i][j]=num;
        if(sudoku(mat, i, j+1, n)){
            return true;
        }
    }
    }
    //backtrack
    mat[i][j]=0;
    return false;
}
    public static void main(String[] args) {
    int n=9;
    Scanner sc=new Scanner(System.in);
    int mat[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
             mat[i][j]=sc.nextInt();
        }
    }
    System.out.println();
    sudoku(mat,0,0,n);
    //display
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
    sc.close();
}
}
