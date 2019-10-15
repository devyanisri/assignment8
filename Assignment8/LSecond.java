import java.util.*;
import java.util.Iterator;
public class LSecond{
    public static void main(String[]args){
        LinkedList<String> Names= new LinkedList<String>();
        Names.add("hema");
        Names.add("jaya");
        Names.add("rekha");
        Names.add("sushma");

      

        Iterator<String> p = Names.listIterator(1);

       
        while (p.hasNext()) {
        System.out.println(p.next());
        }
        }
          
      
    }
