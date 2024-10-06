package WEEK11;

public class ll_util {
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addfirst(40);
        //ll.addfirst(30);
        ll.addfirst(20);
        ll.addfirst(10);
        ll.display();
        ll.addlast(50);
        ll.display();
        ll.addatindex(30, 2);
        ll.removefirst();
        ll.display();
        ll.removelast();
        ll.display();
        System.out.println(ll.removeindex(2));
        // System.out.println(ll.head);
        // System.out.println(ll.head.data)
        //System.out.println(ll.getfirst()+" "+ll.getlast()+" "+ll.getindex(3));
       //System.out.println(ll.getNode(3).data);
       

    }
}
