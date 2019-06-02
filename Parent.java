public class Parent {
void show()
{
System.out.println("parents show");
} }   
class Child extends Parent
{
@Override
void show(){System.out.println("childss show");}
}
class Main{

    public static void main (String args[])
{
Parent p1=new Parent();
p1.show();
Child c1=new Child();
c1.show();
}
}

