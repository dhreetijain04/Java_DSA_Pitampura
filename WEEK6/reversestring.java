package WEEK6;

public class reversestring {
    static String reverse(String s){
        String reversed=" ";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
        } 
        return reversed;
       }

    public static void main(String[] args) {
        String s=new String("potato");
        System.out.println(reverse(s));
    }
}
