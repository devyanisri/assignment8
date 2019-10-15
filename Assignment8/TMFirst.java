import java.util.*;
public class TMFirst{
    public static void main(String args[]){
        TreeMap<Integer,String> Colors=new TreeMap<Integer,String>();
        Colors.put(1,"Red");
        Colors.put(2,"Pink");
        Colors.put(3,"Blue");
        Colors.put(4,"White");

for(Map.Entry<Integer,String> x:Colors.entrySet()){
    System.out.println(x.getKey()+"=>"+x.getValue());
}


    }
}