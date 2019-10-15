import java.util.*;
public class TSet{
    public static void main(String args[]){
        // reverse
        TreeSet<String> set = new TreeSet<String>();
        set.add("Rose");
        set.add("Violet");
        set.add("Marigold");
        set.add("Dehalia");

        Iterator<String> itr=set.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}