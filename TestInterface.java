interface inl
{
final int a=10;

void display();
}

public class TestInterface implements inl {
    
    @Override
    public void display()
    {
        System.out.println("INTERFACE");
    }

    public static void main(String args[]){
    TestInterface T1=new TestInterface();
    T1.display();
    System.out.println(a);
    
    }
}
