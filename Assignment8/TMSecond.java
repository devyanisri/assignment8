import java.util.*;
public class TMSecond{
    public static void main(String args[]){

    TreeMap<String,String> Color=new TreeMap<String,String>();

    Color.put("c1","Red");
    Color.put("C2","Yellow");
    Color.put("C3","Orange");
    Color.put("C4","purple");

    TreeMap<String,String> Paint=new TreeMap<String,String>();
    Paint.put("A1","Maroon");
    Paint.put("A2","Violet");
    System.out.println(" Paint: "+Paint);
    Color.putAll(Paint);
    System.out.println("Afterv coping values"+Paint);
    }
}