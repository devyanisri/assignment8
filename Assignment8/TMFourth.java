import java.util.*;
public class TMFourth{
    public static void main(String args[]){
         TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  tree_map1.put("C1", "Red");
  tree_map1.put("C2", "Green");
  tree_map1.put("C3", "Black");
  tree_map1.put("C4", "White"); 
System.out.println("original TreeMap:"+tree_map1);

System.out.println("Checking the entry for C1: ");
  System.out.println("Value is: " + tree_map1.floorEntry("C1"));

System.out.println("Checking the entry for C3: ");
  System.out.println("Value is: " + tree_map1.floorEntry("C3"));

    }
}