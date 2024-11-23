package WEEK15;

public class implementation {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 1, 5, 7, 3, 2 };
        heaps hp = new heaps(arr);
        hp.display();
        hp.Add(-1);
        hp.display();
        hp.remove();
        hp.display();
    }
}
