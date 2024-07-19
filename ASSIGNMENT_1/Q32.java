package ASSIGNMENT_1;

public class Q32 {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                System.out.print( "* ");
                
            }
            else{
                System.out.print(i+ " ");
            }
        } 
    System.out.println();}
        for(int i=n-1;i>=1;i--){
           for(int k=1;k<=n-i; k++){
            System.out.print(" ");
           }
            for(int j=1;j<=i-1&&j<=n-1;j++){
                if(j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
        System.out.println();
        }
        
    }
    }

