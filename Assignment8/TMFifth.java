import java.util.*;
public class TMFifth{
    public static void main(String args[]){
        TreeMap<Integer,String> Colors=new TreeMap<Integer,String>();
        Colors.put(1,"Red");
        Colors.put(2,"Pink");
        Colors.put(3,"Blue");
        Colors.put(4,"White");

     System.out.println("original treemap:"+Colors);

     System.out.println("Reverse order view of Keys"+Colors.descendingKeySet());   
    }}
