package WEEK4;

public class timecomplexity {
    public static void main(String[] args) {
        int N=100;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j+=i){                                      // NlogN
                System.out.println("HI");
            }
        }


        for(int i=1;i<=N;i++){
            for(int j=1;j<=i*i;j++){
                for(int k=1;k<=N/2;k++){
                    System.out.println("HI");                          //N^4
                }
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){                                      // N^2
                System.out.println("HI");
            }
        }
    }
}
