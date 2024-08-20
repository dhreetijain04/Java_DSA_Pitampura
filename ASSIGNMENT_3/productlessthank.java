package ASSIGNMENT_3;
import java.util.*;
public class productlessthank {
    static int productsubarrays(int [] arr, int n, int k){
        int count=0;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product*=arr[j];
                    if(product<k){
                        count++;
                    }
                    else{
                        break;
                    }
                }
        
        }
        return count;
    }

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr= new int[n];
    int k=sc.nextInt();
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(productsubarrays(arr, n, k));
    sc.close();
}
}

