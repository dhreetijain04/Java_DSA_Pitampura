package ASSIGNMENT_1;

public class Q26 {
    public static void main(String[] args) {
        int n=5;
        
        for(int i=1;i<=n;i++){
            int p=1;
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p++ +" ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
}
