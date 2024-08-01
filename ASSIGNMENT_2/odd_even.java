package ASSIGNMENT_2;

import java.util.Scanner;

public class odd_even {
    static int sodd=0,seven=0;
    static void oddeven(int n){
        sodd=0; seven=0;
        while(n>=0&&n<=1000){
            int digit=n%10;
            if(digit%2==0){
                seven+=digit;
            }
            else{
                sodd+=digit;
            }
            n/=10;
            
        }
    }

    static String yesno(){
        if(sodd%3==0|| seven%4==0){
            return "Yes";
        }
        else{
           return "No";
        }
        
    }  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int carNumber = sc.nextInt();
            oddeven(carNumber);
            System.out.println(yesno());
        }
        sc.close();
    }  
    
}


