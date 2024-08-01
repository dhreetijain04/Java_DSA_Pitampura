package DAY3;
// create a func to print the whole array
// to return the sum of array: 1,2,3,4,5 sum=15
// to print an array in reverse order:5,4,3,2,1

public class arrays {
      static void printArr(int[] arr){
         // for each loop
         for(int i:arr){
            System.out.print(i+" ");
         } 
      }
           
           //sum
      static int sumArr(int[] arr){
         int sum=0;
         for(int i=0;i<arr.length;i++){
            sum += arr[i];
         }
         return sum;
        }

        
      static int sumArray(int[] arr, int a, int b){  
         if(a>b||a<0||b<0||b>=arr.length)
             return 0;
         int sum=0;   
         for(int i=a;i<=b;i++){
            sum+=arr[i];
          }
         return sum;  
     }


      static void printrev(int[] arr){
         for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
         }
      }
             
      public static void main(String[] args) {
         // int[] arr= {1,2,3,4,5,6};
         // for(int i=0;i<arr.length;i++)
         //    arr[i]=i+1;
    //   printArr(arr);
                
         // System.out.println(sumArr(arr));
         // printArr(arr);
      
        // int a=2;
        // int b=4;
        // System.out.println(sumArray(arr,2,4));

        //  printrev(arr);

        
          
       
    }
}



       

        
    
