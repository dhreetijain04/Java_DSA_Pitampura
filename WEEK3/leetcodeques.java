package WEEK3;

public class leetcodeques {
    int sum(int[] nums,int a,int b){
        int sum=0;
        for(int i=a;i<=b;i++)
           sum+=nums[i];
        return sum;   
    }
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int tempsum=sum(nums,i,j);
                maxsum=Math.max(tempsum,maxsum);
            }
        }
        return maxsum;   
        }
    }

    

