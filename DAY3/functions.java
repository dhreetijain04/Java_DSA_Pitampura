package DAY3;
//create a function to pass n natural numbers
//create a function to check if a number n is prime or not
//to return the inverse of  a number n, n=1234 return:4321
// return number of digits present in a number n, n=1234 return 4
//armstrong no or not
public class functions {
   // static void numbers(int n){
        //for(int i=1;i<=n;i++){
           // System.out.println(i);

          // static boolean primeno(int n){
           // for(int i=2;i<n;i++){
                //if(n%i==0){
               //    return (false);
               // return(true);

              // static int inverse(int n){
                //int temp=0;
                //while(n!=0){
                  //  temp=temp*10+(n%10);
                    //n/=10;
                //}
                //return temp;  

                //static int digits(int n){
                  // int temp=0;
                   //while(n!=0){
                    //temp++;
                    //n/=10;
                   // return temp;

                 static int countD(int n){
                    int temp=0;
                     while(n!=0){
                      temp++;
                      n/=10;}
                      return temp;
                     }
                static boolean checkArm(int n){
                    int d=countD(n);
                    int sum=0;
                    while(n!=0){
                        sum+=Math.pow((n%10), d);
                        n/=10;
                    }
                    return (sum==n);
                }               
    public static void main(String[] args) {
       // numbers(5);

      // int n=19;
      // System.out.println(primeno(n));

        // int n=1801;
        // System.out.println(digits(n));

         int n=1230;
         System.out.println(countD(n));
         System.out.println(checkArm(n));
    

    }
}




