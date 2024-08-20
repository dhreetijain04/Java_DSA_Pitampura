package WEEK4;

public class ngeleft {
    static int[] ngel(int[] arr){
        int maxelement=0;
        int[] nge= new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            nge[i]=maxelement;
            maxelement=Math.max(arr[i],maxelement);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] n={3,7,2,5,8,4,9,1,6};
        int[] nge = ngel(n);
        for(int i:nge){
            System.out.print(i+" ");

    }
}
}
