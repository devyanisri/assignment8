import java.util.*;
       
public class Eighth{
    public static void main(String args[]){
        ArrayList<String> Fruits=new ArrayList<String>();
    Fruits.add("Apple");
    Fruits.add("Banana");
    Fruits.add("Orange");
    Fruits.add("Litchi");

ArrayList<String> Fruits1= new ArrayList<String>();
Fruits1.add("Blueberry");
Fruits1.add("Raspberry");
Fruits1.add("Strawberry");

    ArrayList<String> Fruits2=new ArrayList<String>();
    for(String e:Fruits){
    Fruits2.add(Fruits1.contains(e)? "yes":"No" );
    System.out.println(Fruits2);

    }
        }
}                                