package WEEK9;

public class fibonnaci {
    static int fib(int a){
       if(a==0 || a==1){
        return a;
       }
       int fib1=a-1;
       int fib2=a-2;
       return fib1+fib2;
    }
    public static void main(String[] args) {
       System.out.println( fib(8));
    }
}
