import java.util.*;
public class LFirst{
    public static void main(String[]args){
        LinkedList<String> Names= new LinkedList<String>();
        Names.add("hema");
        Names.add("jaya");
        Names.add("rekha");
        Names.add("sushma");
        System.out.println("before adding"+Names);
        Names.add("Nirma");
        System.out.println("after adding"+Names);
    }
}