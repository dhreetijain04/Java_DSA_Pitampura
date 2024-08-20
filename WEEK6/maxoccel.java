package WEEK6;

public class maxoccel {
    static char maxocc(String s){
        int countmaxelem=0;
        char maxele='*';
        int countcurrele=0;
        char currele=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currele){
                if(countcurrele>countmaxelem){
                    countmaxelem=countcurrele;
                    maxele=currele;
                }
                currele=s.charAt(i);
                countcurrele=1;
            }
            else{
                countcurrele++;
            }
        }
        if(countcurrele>countmaxelem){
            countmaxelem=countcurrele;
            maxele=currele;
        }
        return maxele;
    }
    public static void main(String[] args) {
        String s=new String("aaabbbbccdd");
        System.out.println(maxocc(s));
        
    }
}
