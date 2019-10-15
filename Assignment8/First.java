import java.util.*;
class First{
    public static void main(String args[]){
        ArrayList<String> Fruits=new ArrayList<String>();
    Fruits.add("Apple");
    Fruits.add("Banana");
    Fruits.add("Orange");
    Fruits.add("Litchi");
    System.out.println("before addding element"+Fruits);
    Fruits.add(2,"Strawberry");
    System.out.println("after adding element"+Fruits);

        }
}