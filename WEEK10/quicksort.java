package WEEK10;

public class quicksort {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return(i+1);
    }
    static void sort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
         } 
         System.err.println();
    }
    public static void main(String[] args) {
        int[] arr={7,2,6,5,1,3,4};
        int low=0;
        int high=arr.length-1;
        sort(arr, low, high);
        display(arr);
    }
}
