package WEEK6;

public class suficandprefix {
    int[] psum(int[] arr){
        int[] ans=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            ans[i+1]=arr[i]+ans[i];
        }
        return ans;
    }
    int[] ssum(int[] arr){
        int[] result=new int[arr.length+1];
        for(int i=arr.length-1;i>=0;i--){
            result[i]=arr[i]+result[i+1];
        }
        return result;
    }
    public int findMiddleIndex(int[] nums) {
        int[] prefixsum= psum(nums);
        int[] suffixsum= ssum(nums);
        for(int i=0;i<nums.length;i++){
            if(prefixsum[i]==suffixsum[i+1]){
               return i;
            }
        }
        return -1;
    }
}