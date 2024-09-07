package WEEK9;

public class subsequences {
    static void subs( String s1, String s2){
        if(s2.length()==0){
            System.out.println(s1);
            return;
        }
        subs(s1+s2.charAt(0), s2.substring(1));
        subs(s1, s2.substring(1));

    }
    public static void main(String[] args) {
       subs("","CAR");
        }
}
