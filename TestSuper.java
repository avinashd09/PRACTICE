class Vechile
{
int max_speed=120;
}
class Car extends Vechile
{
int max_speed=180;

void display()
{
System.out.println("Displaying max speed of parent class " +super.max_speed);
}
}
public class TestSuper {

    public static void main(String args[])
    
    {
    Car c1=new Car();
    c1.display();
    
    }
}
