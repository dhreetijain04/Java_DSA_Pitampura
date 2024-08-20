package ASSIGNMENT_3;
import java.util.Scanner;
public class intersectionofarrays {
                static void interSectionArr(int[] arr1,int[] arr2,int n,int m){
                    for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                            if(arr2[i]==arr1[j]){
                                System.out.print(arr2[i]+" ");
                                arr1[j]=Integer.MIN_VALUE;
                                break;
                            }
                        }
                    }
                }
                
                public static void main (String args[]) {
                     Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int[] arr=new int[n];
            
                    int m=sc.nextInt();
                    int[] arr2=new int[m];
            
                    for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                    }
                    for(int i=0;i<m;i++){
                        arr2[i]=sc.nextInt();
                    }
            
                    interSectionArr(arr,arr2,n,m);
                    sc.close();
            
                }
                }