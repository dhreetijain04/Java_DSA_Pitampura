package WEEK8;
import java.util.ArrayList;

//create a function to find the max sum of subarray with size k
//[30,30,30,10,20,10,1,40,40]: k=2
//{40,40}
public class maxsumofsubarray {
    static ArrayList<Integer> findsubarray(int[] arr,int k){
        int start=0;
        int end=k-1;
        int maxsum=0;
        for(int i=0;i<=end;i++){
            maxsum+=arr[i];
        }
        int currsum=maxsum;
        int index=0;
        while(end < arr.length-1){
            currsum-=arr[start];
            start++;
            end++;
            currsum+=arr[end];
            if(maxsum<currsum){
                index=start;
                maxsum=currsum;
            }
        }
        ArrayList<Integer> nums= new ArrayList<>();
        for(int i=index;i<index+k;i++){
            nums.add(arr[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={30,30,30,10,20,10,1,40,40};
        ArrayList<Integer> nums= findsubarray(arr, 2);
        System.out.println(nums);
        
    }
}
