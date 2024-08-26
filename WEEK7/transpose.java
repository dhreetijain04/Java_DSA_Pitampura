package WEEK7;

public class transpose {
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
        System.out.println();
    }
    static void mTranspose(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums=new int[3][3];
        populate(nums);
        display(nums);
        mTranspose(nums);
        display(nums);

    }
}
