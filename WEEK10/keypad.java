package WEEK10;

public class keypad {
        static String[] arr = {
            "",    
            "",    
            "abc", 
            "def", 
            "ghi", 
            "jkl", 
            "mno", 
            "pqrs",
            "tuv", 
            "wxyz" 
        };
        static void keypd(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch= ques.charAt(0);
        String press= arr[ch-'0'];
        for(int i = 0; i < press.length(); i++){
            keypd(ques.substring(1),ans+press.charAt(i));
        }
    }
    public static void main(String[] args) {
        keypd("245","");
    }
}
