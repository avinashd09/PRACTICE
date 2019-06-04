
import java.io.File;
import java.util.Date;

public class FileDemo {

    public static void main(String args[])
    {
    File f=new File("C:\\Users\\Avii\\Documents\\NetBeansProjects\\PRACTICE\\src\\AVII.TXT");
    boolean b=f.exists();
    System.out.println(b);    
    long lastModified = f.lastModified();
        System.out.println(lastModified);
        Date dt=new Date(lastModified);
        System.out.println(dt);
        boolean b1=f.isFile();
        System.out.println(b);
        long length=f.length();
        System.out.println(length);
        boolean b3=f.isHidden();
        System.out.println(b3);
        boolean b4=f.isFile();
        System.out.println(b4);
        boolean b5=f.isDirectory();
        System.out.println(b5);
        
        File f2=new File("C:\\JAVA7");
        String s[]=f2.list();
        for(String tmp:s)
        {
        System.out.println(tmp);
        
        }
    }
}
