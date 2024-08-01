package ASSIGNMENT_2;
import java.util.Scanner;
public class series {
    static void series_value(int n1,int n2){
        int a=0;
        int n=1;
        while(n1>a && n1<100){
            int temp=3*n+2;
            if(temp % n2!= 0){
              System.out.println(temp);
              a++;
            }
         n++;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        series_value(n1,n2);
        sc.close();
    }
}
