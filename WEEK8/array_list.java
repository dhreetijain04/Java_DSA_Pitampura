package WEEK8;
import java.util.ArrayList;
import java.util.Collections;
public class array_list {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> arr= new ArrayList<>();
        //add
        arr.add(20);
        arr.add(90);
        arr.add(60);
        //get
        System.out.println(arr.get(0));
        //remove
        System.out.println(arr.remove(0));
        //update
        arr.set(1,50);
        //display
        System.out.println(arr);
        //size
        System.out.println(arr.size());
        //sort
        Collections.sort(arr);
        System.out.println(arr);
        //clear
        arr.clear();
        System.out.println(arr);
    }
}
