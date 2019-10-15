//Linked List to AL

import java.util.*;
public class LSixth{
    public static void main(String[]args){
        LinkedList<String> Names=new LinkedList<String>();

        Names.add("Medha");
        Names.add("Pathikrit");
        Names.add("Ankita");
        Names.add("Mausumi");

        ArrayList<String> Names1= new ArrayList<String>(Names);
        for(String e:Names1){
            System.out.println(e);
        }
    }
}