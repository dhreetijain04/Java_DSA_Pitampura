package WEEK4;

public class sellandbuystocks {
    //method1
    public int maxProfit(int[] prices) {
        int mprofit=0;
        int currprofit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
               currprofit=prices[j]-prices[i];
               mprofit=Math.max(mprofit,currprofit);
            }
        }
        return mprofit;
    }
    //method2
    public int maxProfitone(int[] prices) {
        int mprofit=0;
        int currprofit=0;
        int buyat=prices[0];
        for(int i=0;i<prices.length;i++){
            if(buyat>prices[i]){
                buyat=prices[i];
            }
            else{
                currprofit=prices[i]-buyat;
                mprofit=Math.max(currprofit,mprofit);
            }
        }
        return mprofit;
    }
}