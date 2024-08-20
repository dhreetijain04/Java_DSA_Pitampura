package WEEK6;
//UNSORTED STRING
public class maxoccel2 {
    static char findmaxocc(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index=i;
            }
        }
        return (char)('a'+index);
    }
    public static void main(String[] args) {
        String s=new String("aabschasdhaaaa");
        System.out.println(findmaxocc(s));
    }
}
