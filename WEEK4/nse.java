package WEEK4;

public class nse {
    static int[] nser(int[] arr){
        int minelement=Integer.MAX_VALUE;
        int[] nseright=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(minelement==Integer.MAX_VALUE)
                nseright[i]=0;
            else
            nseright[i]=minelement;
            minelement=Math.min(arr[i],minelement); 
    }
        return nseright;
    }
    public static void main(String[] args) {
        int[] n={3,7,2,5,8,4,9,1,6};
        int[] nseright = nser(n);
        for(int i:nseright){
            System.out.print(i+" ");
        }
    }
}
