import java.util.*;
public class Ninth{
    public static void main(String[]args){
        LinkedList<String> Names= new LinkedList<String>();
        Names.add("hema");
        Names.add("jaya");
        Names.add("rekha");
        Names.add("sushma");
         System.out.println("Original Linked List:"+ Names);

         System.out.println("The removed element element is: "+Names.pop());
         System.out.println("New List:"+Names);
    }
}