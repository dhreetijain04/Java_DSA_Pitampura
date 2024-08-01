package ASSIGNMENT_3;
import java.util.Scanner;
public class intersectionofarrays {
    static void arrays(int[] arr, int[] arr2, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    if(arr2[i]==arr2[j]){
                        System.out.print(arr[i]);
                        i++;
                        j++;
                    }
                    else if(arr[i]>arr2[j]){
                        j++;
                    }
                    else {
                        i++;
                    }
                }
            }
        }
        
    
        static void printarr(int[] arr){
                for(int i:arr){
                    System.out.print(i+" ");
                }
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2= new int[m];
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        arrays(arr,arr2,n,m);
        printarr(arr);
        sc.close();
    }    
    
}
