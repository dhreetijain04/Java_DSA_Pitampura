package WEEK3;

public class lowerbound {
    static int lowerBound(int[] arr,int num){
        int firstocc=-1;
        int low=0;
        int high=arr.length-1, mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                firstocc=mid;
                high=mid-1;
            }
            else if(arr[mid]>num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return firstocc;

    }
    public static void main(String[] args) {
        int num=3;
        int[] arr={1,2,2,3,3,3,4,5,6,7,7,7};
        System.out.println(lowerBound(arr,num));
    }
}
