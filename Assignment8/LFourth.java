import java.util.*;

public class LFourth{
    public static void main(String[]args){
        LinkedList<String> Color= new LinkedList<String>();
        Color.add("Red");
        Color.add("Pink");
        Color.add("Violet");
        Color.add("Magenta");

System.out.println("original Linked list:" +Color);

Object first_element=Color.getFirst();
System.out.println("First element is:"+first_element);

Object last_element=Color.getLast();
System.out.println("Last element is:"+last_element); 

    }
}