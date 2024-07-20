package DAY3;
// create a func to print the whole array
public class arrays {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
}
    public static void main(String[] args) {
        //int[] arr= new int[10];
       // arr[0]=3;
       // System.out.println(arr[0]);

       //int[] arr= new int[10];
       int[] arr= {1,2,3,4,5,6};
       for(int i=0;i<arr.length;i++)
          arr[i]=i+1;
          printArr(arr);

    }
}
