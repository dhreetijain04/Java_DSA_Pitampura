package WEEK7;

public class twodarrays {
    static void populate(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
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
        //initialise 2d arrays

        int[][] nums=new int[3][4];
        // int[] arr={1,2,3};
        // int[][] num= {{1,2,3,4},
        //               {5,6,7,8},
        //               {9,10,11,12}};
        // System.out.println(nums[0][1]);
        // System.out.println(nums[1]);
        // System.out.println(num[0][0]);
    int[][][][][] grid=new int[4][2][1][2][3];
    System.out.println(grid);
    
    populate(nums);
    display(nums);


    }
}
