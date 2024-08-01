package WEEK3;

public class selectionsort {
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=minimumValue(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }

    static int minimumValue(int[] arr, int a){
        int mini=a;
        for(int i=a+1;i<arr.length;i++)
            if(arr[mini]>arr[i])
                mini=i;
        return mini;    
    }

    static void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={2,1,5,8,4,7};
        int a=4;
        selectionSort(arr);
        minimumValue(arr,a);
        display(arr);

    }
}
