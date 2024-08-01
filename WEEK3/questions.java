package WEEK3;
//countoccurence
public class questions {
    static int lowerbound(int arr[], int num){
        int low=0, high=arr.length-1;
        int firstocc=-1;
        while(low<=high){
            int mid=(low+high)/2;
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

    static int upperbound(int arr[], int num){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }
            else if(arr[mid]>num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return ans;
    }

    static int countocc(int[] arr,int num){
        int lb=lowerbound(arr,num);
        if(lb==-1){
            return 0;
        }
        int ub=upperbound(arr,num);
        return ub-lb;

    }

    public static void main(String[] args) {
        int num=6;
        int[] arr={1,2,3,4,4,5,6,6,6,7,8};
        System.out.println(countocc(arr,num));
        }

    }























