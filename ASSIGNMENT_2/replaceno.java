package ASSIGNMENT_2;

import java.util.Scanner;

public class replaceno {
    static int replace(int n){
        if(n==0){
            return 5;
        }
        else{
        int result=0;
        int place=1;
        while(n>0){
            int d=n%10;
            if(d==0){
                d=5;
            }
            result+=d*place;
            place*=10;
            n/=10;
        }
        
         return result;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(replace(n));
        sc.close();
    }
}
