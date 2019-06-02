class person
{
    void message()
    {
    System.out.println("PARENT CLASS WELCOMES YOU");
    }

}
class Student1 extends person
{
@Override
void message()
{
 System.out.println("CHILD CLASS WELCOMES YOU");
}
void display()
{

message();

super.message();
       
}
}

public class MethodSuperTest {
    public static void main(String args[])
    
    {
    Student1 s1=new Student1();
    s1.display();
    }
}
