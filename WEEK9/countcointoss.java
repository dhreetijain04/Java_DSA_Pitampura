package WEEK9;

public class countcointoss {
    static int ct(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return 2;
        }
        int x= ct(n-1);
        int y= ct(n-1);
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(ct(10));
    }
}
