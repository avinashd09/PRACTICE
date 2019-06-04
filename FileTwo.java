
import java.io.File;
import java.io.IOException;

public class FileTwo {

    public static void main(String args[]) throws IOException
    {
    
    File f=new File("C:\\JAVA7\\ASDF");
    boolean b=f.mkdir();
    System.out.println(b);
    boolean b1=f.delete();
    System.out.println(b1);
    
    File f1=new File("C:\\JAVA7\\ASDF.txt");
    File f2=new File("C:\\JAVA7\\ASDF1.txt");
    boolean b3=f1.renameTo(f2);
    System.out.println(b3);
    
    File f3=new File("C:\\JAVA7\\ASDFRT.txt");
    boolean b4=f3.createNewFile();
    System.out.println(b4);
    
    }
}
