package WEEK7;

public class sumofarray {
    static void populate(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }
    static int sum(int[][] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] nums=new int[3][4];
        populate(nums);
        System.out.print(sum(nums));
    }
}
