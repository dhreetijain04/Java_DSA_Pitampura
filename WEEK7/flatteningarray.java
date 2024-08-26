package WEEK7;
import java.util.*;
public class flatteningarray {
    static void sortcomplete(int[][] nums){
        int[] arr=flaten(nums);
        Arrays.sort(arr);
        fillArray(nums,arr);
    }
    static void fillArray(int[][] nums,int[] arr){
        int col=nums[0].length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=arr[col*i+j];
            }
        }
    }
    static int[] flaten(int[][] nums){
        int rows=nums.length;
        int col=nums[0].length;
        int[] arr=new int[rows*col];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[col*i+j]=nums[i][j];
            }
        }
        return arr;
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
        sortcomplete(nums);           
        display(nums);

    }
}
