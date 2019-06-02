public class TestFinallyBlock {

    public static void main(String args[])
    {
    try
    {
    int data=10/0;
    System.out.println(data);
    }catch(Exception e){System.out.println(e);}
    finally{
        System.out.println("FINALLY BLOCK IS EXECUTED");
    }
    System.out.println("REST OF CODE");
    
    }
}
