package WEEK9;

public class cointoss {
    static void ct(int n, String result){
        if(n==0){
            System.out.println(result);
            return;
        }
        ct(n-1,result+ "H");
        ct(n-1, result+ "T");
    }
    public static void main(String[] args) {
        ct(3, "");
    }
}
