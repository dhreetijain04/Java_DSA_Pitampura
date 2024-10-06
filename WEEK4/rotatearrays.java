package WEEK4;

public class rotatearrays {
    //method 1
    public void rotate(int[] nums, int k) {
        int[] temp=new int[nums.length];
        int n=nums.length;
        k%=n;
        for(int i=0;i<n-k;i++)
         temp[i+k]=nums[i];
        for(int j=0;j<k;j++)
             temp[j]=nums[n-k+j];
             //deep copy;
        for(int i=0;i<n;i++){
         nums[i]=temp[i];
        }
         
      }
      //method2
    static void reverse(int[] nums,int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
    static void rotateone(int[] nums,int k){
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
    //method3
    static void rotatetwo(int [] nums, int k){
        for(int i =0;i<k;i++){
            rotateone(nums);
        }
    }
    static void rotateone(int [] nums){
        int temp = nums[nums.length-1];
        for(int i = nums.length-1;i>0;i--){
            nums[i]=nums[i-1];

        }
        nums[0]=temp;
    }
}