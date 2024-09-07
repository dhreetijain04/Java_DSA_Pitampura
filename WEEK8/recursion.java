package WEEK8;

public class recursion {
    static int multiply(int a,int b){
        if(a==1){
            return b;
        }
        int x=b+multiply(a-1,b);
        return x;
    }

    //factorial  
    //HEAD RECURSION
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int x=n*fact(n-1);
        return x;
    }
    // TAIL RECURSION
    static int facts(int n,int x){
        if(n==0 || n==1){
            return x;
        }
        return facts(n-1,n*x);
    }
    //power
    // HEAD RECURSION
    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        int x=a*pow(a,b-1);
        return x;
    }
    //TAIL RECURSION 
    static int pows(int a,int b,int x){
        if(b==0){
            return x;
        }
        return pows(a,b-1,a*x);
    }
    public static void main(String[] args) {
        System.out.println(multiply(3,3));
        System.out.println(fact(3));
        System.out.println(pow(3,4));
        System.out.println(pows(3,4,1));
        System.out.println(facts(3,1));
    }
}
