package WEEK9;

public class home {
    public static void main(String[] args) {
        cats c1=new cats("kitty","white","none");
        cats c2= new cats();
        c1.display();
        c2.display();
        c1.callcat();
        c2.callcat();

    }
}
