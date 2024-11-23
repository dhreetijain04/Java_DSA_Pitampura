package WEEK15;

import java.util.ArrayList;

public class heaps {
    // min heap
    private ArrayList<Integer> ll = new ArrayList<>();

    public heaps() {
    };

    public heaps(int[] arr) {
        for (int i : arr) {
            Add(i);
        }
    }

    public void Add(int i) {
        ll.add(i);
        upHeapify(ll.size() - 1);
    }

    private void upHeapify(int ci) {
        int pi = (ci - 1) / 2;
        if (ll.get(pi) > ll.get(ci)) {
            swap(pi, ci);
            upHeapify(pi);
        }
    }

    private void swap(int pi, int ci) {
        int val1 = ll.get(pi);
        int val2 = ll.get(ci);
        ll.set(pi, val2);
        ll.set(ci, val1);
    }

    public void display() {
        System.out.println(ll);
    }

    public int get() {
        return ll.get(0);
    }

    public int size() {
        return ll.size();
    }

    public int remove() {
        swap(0, ll.size() - 1);
        int rv = ll.remove(ll.size() - 1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi) {
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;

        int mini = pi;
        if (lci < ll.size() && ll.get(lci) < ll.get(pi)) {
            mini = lci;
        }
        if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
            mini = rci;
        }
        if (mini != pi) {
            swap(mini, pi);
            downheapify(mini);
        }
    }
}
