package WEEK7;
import java.util.*;
public class rowssorting {
    static void sortbyrows(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                Arrays.sort(nums[i]);
        }
    }
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
    sortbyrows(nums);
    display(nums);
}
}
