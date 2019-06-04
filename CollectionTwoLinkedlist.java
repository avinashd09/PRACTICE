
import java.util.LinkedList;

public class CollectionTwoLinkedlist {
public static void main(String args[])
    {
    String s1="one";
    String s2="two";
    String s3="three"; 
    
    LinkedList l1=new LinkedList();
    l1.add(s2);
    l1.add(s1);
    System.out.println(l1);
   // l1.clear();
   // System.out.println(l1);
    l1.descendingIterator();
    System.out.println(l1);
    l1.remove();
    System.out.println(l1);
    l1.removeFirst();
    System.out.println(l1);
    }   
}
