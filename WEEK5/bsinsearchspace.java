package WEEK5;

public class bsinsearchspace {
    static boolean check(int speed,int dist,int time){
        int dist_travelled=speed*time;
        if(dist_travelled>=dist){
            return true;
        }
        else return false;
        }
    
    
  static int reachcentre(int dist,int time){
    int lowspeed=0;
    int highspeed=200;
    int optimalspeed=-1;
    while(lowspeed<=highspeed){
        int mid=highspeed-(highspeed-lowspeed)/2;
        if(check(mid,dist,time)){
        optimalspeed=mid;
        highspeed=mid-1;
        }
        else{
            lowspeed=mid+1;
        }
    }
    return optimalspeed;
  }
  public static void main(String[] args) {
    int dist=50, time= 2;
    System.out.println(reachcentre(dist, time));
  }
}