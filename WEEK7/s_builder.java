package WEEK7;

public class s_builder {
    public static void main(String[] args) {
        //initialise

       // StringBuilder sb= new StringBuilder(10);
        StringBuilder sb= new StringBuilder("hello");
        //sb.append("hello");
        // sb.append("hey");
        // sb.append("bye");
        // sb.insert(2,"y");
        // sb.delete(2,5);                //end:upperbound
        // sb.reverse();       
        // sb.ensureCapacity(100);
        sb.replace(2,4,"wow");      //* */
        

        System.out.println(sb);
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // System.out.println(sb.substring(5));


        // String s=new String("hello");
        // System.out.println(s);
    }
}
