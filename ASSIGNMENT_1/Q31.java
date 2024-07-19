package ASSIGNMENT_1;

public class Q31 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=5;j>=1;j--){
                if(i+j==2*i){
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
