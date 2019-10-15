import java.util.*;
public class LThird{
    public static void main(String a[]){
        LinkedList<String> animal= new LinkedList<String>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Mouse");
        animal.add("Horse");

        Iterator<String> x= animal.descendingIterator();
        while(x.hasNext()){
            System.out.println(x.next());
            }
        }
    }
