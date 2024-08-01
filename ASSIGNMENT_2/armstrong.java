package ASSIGNMENT_2;

import java.util.Scanner;

public class armstrong {
    static int countD(int n){
        int temp=0;
        while(n>0){
          temp++;
          n/=10;}
          return temp;
         }
    static boolean checkArm(int n){
        int d=countD(n);
        int sum=0;  
        int temp=n;
        while(temp>0){
            sum+=Math.pow((temp%10), d);
            temp/=10;
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkArm(n));
        sc.close();
        
    }
}
        
        

