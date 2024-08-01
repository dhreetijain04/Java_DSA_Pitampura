package ASSIGNMENT_2;

import java.util.Scanner;

public class celciustemp {
    static void temp(int minf,int maxf,int step){
        if(minf<0||minf>100||maxf<minf||maxf>500||0>step||step>150){
            return;
        }
        for(int f = minf ; f<=maxf ; f+=step){
            int c = (int) ((5.0/9)*(f - 32));
            System.out.println(f + "\t" + c);
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int minf = sc.nextInt();
         int maxf = sc.nextInt();
         int step = sc.nextInt();
         sc.close();
         temp(minf,maxf,step);
    }
    }





    
