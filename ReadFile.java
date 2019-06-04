
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String args[]) throws FileNotFoundException, IOException
    {
         FileInputStream FIS=new FileInputStream("C:\\JAVA7\\ASDF1.txt");
        int size=FIS.available();
        byte b[]=new byte[size];
        FIS.read(b);
        String s=new String(b);
        System.out.println(s);
       FileInputStream FIS1 = new FileInputStream("C:\\JAVA7\\ASDFRT.txt");
            while(true)
            {
                int n=FIS1.read();
                if(n==-1)break;
                System.out.println((char)n);
            }
            FIS.close();
        }
    }

