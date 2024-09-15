package WEEK9;

public class countsubsequences {
    static int subs(String s2, int ans){
        if(s2.length()==0){
           return 1;
        }
       return subs(s2.substring(1), 2*ans);   
        
    }
    public static void main(String[] args) {
       System.out.println(subs("CAR", 2));
        }

}
