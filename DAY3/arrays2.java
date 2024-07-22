package DAY3;
import java.util.Arrays;
public class arrays2 {
    static void printArr(int[] arr){
      for(int i:arr){
         System.out.print(i+ " ");}
      System.out.println();}
                  
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
                }
                     
    static void reverseusingswap  (int[] arr){
        for(int i=0,j=arr.length-1;i<j;j--,i++){
            swap(arr,i,j);
            printArr(arr);
                    }
        
                 } 

    //create a function to search an element in array
    static boolean linearsearch(int[] arr, int n){
        for(int i=0; i<arr.length;i++){
            if(i==n){
                System.out.println(i);
                return true;
            }
        }
        return false;
 }  
 
    static boolean binarysearch(int[] arr, int n){
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid=i+j/2;
            if(arr[mid]==n) return true;
            else if(arr[mid]<n) i=mid+1;
            else j=mid-1;
         }
         return false;
    }
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5};
        // reverseusingswap(arr);
        // printArr(arr);

        // int[] arr={1,2,3,4,5};
        // linearsearch(arr,3);
        //printArr(arr);

        int[] arr={1,2,4,5,10,6};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println(binarysearch(arr,10));
        

    }
}


