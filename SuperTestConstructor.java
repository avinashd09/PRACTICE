class Person1
{
Person1()
{
System.out.println("PARENT CLASS CONSTRUCTOR");
}
}
class Man extends Person1
{
Man()
{
super();

System.out.println("CHILD CLASS CONSTRUCTOR");
}
}
public class SuperTestConstructor {

    public static void main(String args[])
    
    {
    Man m1=new Man(); 
    }
}
