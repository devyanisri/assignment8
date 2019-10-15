import java.util.*;
public class TMSixth{
    public static void main(String args[]){
        TreeMap<Integer,String> Colors=new TreeMap<Integer,String>();
        Colors.put(1,"Red");
        Colors.put(2,"Pink");
        Colors.put(3,"Blue");
        Colors.put(4,"White");
        System.out.println("Original Colors:"+Colors);

 
  System.out.println("Checking the entry for Red: ");
  System.out.println("Key(s): " + Colors.headMap(10));
  System.out.println("Checking the entry for 30: ");
  System.out.println("Key(s): " + Colors.headMap(30));

    }}



