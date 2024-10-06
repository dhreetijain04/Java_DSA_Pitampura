package WEEK11;

public class linkedlist {
    class Node{
        int data;
        Node next;
    }
     Node head;
     private Node tail;
     private int size;
     //TC:O(1);
     public void addfirst(int item){
        Node nn= new Node();
        nn.data=item;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
     }
     //display
     public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
     }

     public void addlast(int item){
        if(size==0){
            addfirst(item);
        }
        else{
            Node nn= new Node();
            nn.data=item;
            tail.next=nn;
            size++;
        }
    }
    public Node getNode(int k){
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addatindex(int item,int k){
        if(k==0){
            addfirst(item);
        }
        else if(k==size-1){
            addlast(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            Node K_1th=getNode(k-1);
            nn.next=K_1th.next;
            K_1th.next=nn;
            size++;
        }
      
    }
    public int getfirst(){
        return head.data;
    }
    public int getlast(){
        return tail.data;
    }
    public int getindex(int k){
        if(k<0 || k>=size){
            return -1;
        }
        else if(k==0){
            return getfirst();
        }
        else if(k==size-1){
            return getlast();
        }
        else{
            return getNode(k).data;
        }
    }
    public int removefirst(){
        int rv=head.data;
        if(size==1){
            head=null;
            tail=null;
            size--;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rv;
    }
    public int removelast(){
        int rl=tail.data;
        if(size==1){
            return removefirst();
        }
        else{
            Node sl=getNode(size-2);
            sl.next=null;
            tail=sl;
            size--;
            return rl;
        }
    }
    public int size(){
        return size;
    }
    public int removeindex(int k){
        if(k==0){
            return removefirst();
        }
        else if(k==size-1){
            return removelast();
        }
        else{
            Node k_1th=getNode(k-1);
            Node k_th=k_1th.next;
            k_1th.next=k_th.next;
            k_th.next=null;
            size--;
            return k_th.data;
        }
    }
}


