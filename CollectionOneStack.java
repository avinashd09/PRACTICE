
import java.util.Stack;

public class CollectionOneStack {

    public static void main(String args[])
    {
    String s1="one";
    String s2="two";
    String s3="three";
    
    Stack stk=new Stack();
    stk.push(s1);
    stk.push(s2);
    System.out.println(stk);
    stk.pop();
    stk.pop();
    stk.push(s3);
    System.out.println(stk);
}
}