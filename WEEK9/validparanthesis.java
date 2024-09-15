package WEEK9;

public class validparanthesis {
    static void validp(int n, String s, int l, int r){
        if(l==n && r==n){
            System.out.println(s);
            return;
        }
        if(l<n){
            validp(n,s+"{",l+1,r);
        }
        if(r<l){
            validp(n,s+"}",l,r+1);
        }
    }
    public static void main(String[] args) {
        validp(3,"", 0, 0);
    }
}
