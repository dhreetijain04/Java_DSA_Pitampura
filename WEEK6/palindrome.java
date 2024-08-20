package WEEK6;

public class palindrome {
    static boolean palindromeno(String s){
        int i=0;int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                 return false;
                }  
            i++;
            j--;
        }
        return true;
    }
            

    public static void main(String[] args) {
        String s=new String("detartrated");
        System.out.println(palindromeno(s));
    }
}
