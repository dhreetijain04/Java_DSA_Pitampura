package DAY3;
// create a func to print the whole array
// to return the sum of array: 1,2,3,4,5 sum=15
// to print an array in reverse order:5,4,3,2,1
// reverse the array
public class arrays {
//     static void printArr(int[] arr){
//         // for each loop
//         // for(int i:arr)
//           //System.out.print(i+" ");
//           for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+ " ");
//     }
// }

    public static void main(String[] args) {
    //    int[] arr= {1,2,3,4,5,6};
    //    for(int i=0;i<arr.length;i++)
    //       arr[i]=i+1;
    //       printArr(arr);
      
        //  int [] arr={1,2,3,4,5};
        //  int sum=0;
        //  for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        //  }
        //   System.out.println(sum);

        int[] arr={1,2,3,4,5};
           
        for(int i=arr.length-1;i>=0;i--){
           arr[i]=i+1;
         
        System.out.print(arr[i]+" ");
        }
    }
}