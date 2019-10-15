import java.util.*;
class Second{
    public static void main(String args[]){
        ArrayList<String> Fruits=new ArrayList<String>();
    Fruits.add("Apple");
    Fruits.add("Banana");
    Fruits.add("Orange");
    Fruits.add("Litchi");
    System.out.println("before"+Fruits);
    //Retrieve 1 and 4 element
String element =Fruits.get(0);
System.out.println("First element:"+element);
element=Fruits.get(3);
    System.out.println("Fourth element :"+element);

        }
}