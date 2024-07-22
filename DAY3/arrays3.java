package DAY3;
// reverse the array
public class arrays3 {
    static void printArr(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        } 
    }

    static void reverse(int[] arr){
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[arr.length-i-1];
        }
       //deep copy
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
           }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        printArr(arr);
    }
}
        
  
    
