package WEEK6;

public class reversewords {
    
    static void reverseWords(String s){
        String[] arr= s.split("\\s");
        System.out.print("!");
        String temp="";
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i]+" ";
        }
        temp=temp.trim();
        System.out.print(temp);
        System.out.print("!");
    }
    public static void main(String[] args) {
        String original= "I am Batman";
        // String rev= reverse(original);
        reverseWords(original);
    }
}

