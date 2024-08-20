package ASSIGNMENT_3;

import java.util.Scanner;
public class lengthofrepeatedsubarray {
    static int search(int[] arr1,int n,int[] arr2,int m){
        int maxlen=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int currlen=0;
                while (i + currlen < n && j + currlen < m && arr1[i + currlen] == arr2[j + currlen]) {
                    currlen++;
                }
                maxlen=Math.max(currlen,maxlen);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.print(search(arr1, n, arr2, m));
        sc.close();
    }
}
