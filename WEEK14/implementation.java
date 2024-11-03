package WEEK14;

public class implementation {
    public static void main(String[] args) {
        binarytrees bt = new binarytrees();
        // bt.Display();
        // System.out.println(bt.findmax(bt.root));
        // System.out.println(bt.height(bt.root));
        bt.infix(bt.root);
        bt.prefix(bt.root);
        bt.postfix(bt.root);
    }
}
