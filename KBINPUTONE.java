
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KBINPUTONE {

    public static void main(String args[]) throws IOException
    {
    InputStreamReader ISR;
        ISR = new InputStreamReader(System.in);
    BufferedReader BR=new BufferedReader(ISR);
    System.out.println("ENTER YOUR NAME");
    String name=BR.readLine();
    System.out.println("ENTER YOUR AGE");
    int age=Integer.parseInt(BR.readLine());
    System.out.println("NAME "+name);
    System.out.println("AGE "+age);
    }
}
