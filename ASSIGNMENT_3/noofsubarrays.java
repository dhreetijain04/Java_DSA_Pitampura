package ASSIGNMENT_3;
import java.util.*;
public class noofsubarrays {
    static int subarrays(int[] arr, int n, int k){
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
               sum=sum+arr[j];
                if(sum==k){
                    count++;
                }
                else if(sum>k){
                    break;
                }
            }    
        }
        return count;
    }
    static int count(int[] arr,int n, int k){
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    count++;
                }
            }
        }
        return count;
    } 
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    int k=sc.nextInt();
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(subarrays(arr, n, k));
    System.out.println(count(arr, n, k));
    sc.close();
}
    }

