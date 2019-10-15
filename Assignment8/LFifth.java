import java.util.*;
public class LFifth{
    public static void main(String args[]){

        LinkedList<String> food=new LinkedList<String>();
        food.add("pizza");
        food.add("Burger");
        food.add("Roti");

        System.out.println("LinkedList:"+ food);

        System.out.println("the last element is:"+food.getLast());
    }
}