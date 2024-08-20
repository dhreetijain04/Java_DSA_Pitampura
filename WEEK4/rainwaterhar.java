package WEEK4;

public class rainwaterhar {
    public int trap(int[] height) {
        //method1
        int totalwater=0;
        for(int i=0;i<height.length;i++){
           int currwater=0;
           int currlevel=0;
           int leftgreatest=0, rightgreatest=0;
           for(int j=i-1;j>=0;j--){
            leftgreatest=Math.max(leftgreatest,height[j]);
           }
           for(int j=i+1;j<height.length;j++)
            rightgreatest=Math.max(rightgreatest,height[j]);
            currlevel=Math.min(rightgreatest,leftgreatest);
            currwater=currlevel-height[i];
            if(currwater>0)
               totalwater+=currwater;
           }
           return totalwater;
        }


        //method2
        static int[] ngel(int[] arr){
            int maxelement=0;
            int[] nge= new int[arr.length];
            for(int i=0;i<=arr.length-1;i++){
                nge[i]=maxelement;
                maxelement=Math.max(arr[i],maxelement);
            }
            return nge;
        }
        static int[] nger(int[] arr){
            int maxelement = 0;
            int[] nger = new int[arr.length];
            for (int i=arr.length-1 ; i>=0 ; i--){
                nger[i] = maxelement;
                maxelement = Math.max(arr[i] , maxelement);
            }
            return nger;
        }
        public int trapone(int[] height) {
            int waterlevel=0;
            int water=0;
            int[] nger=nger(height);
            int[] ngel=ngel(height);
            for(int i=0;i<height.length;i++){
                if(nger[i]>ngel[i]){
                  waterlevel=ngel[i];
                }
                else{
                    waterlevel=nger[i];
                }
             int a=waterlevel-height[i];
             if(a>0){
                water+=a;
             }
            }
            return water;
        }
    }

            