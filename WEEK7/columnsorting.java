package WEEK7;
import java.util.*;
public class columnsorting {
    static void sortbycol(int[][] nums){
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
    }
    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] nums= {{1,4,3},
                  {7,5,8},
                   {6,2,9}};
        sortbycol(nums);          
        display(nums);
    }
}
