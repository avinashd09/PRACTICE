
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveStudentInfo {

    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        STUDENT0 s0=new STUDENT0(121,"AVINASH",85,"LEADER");
    s0.showInfo();
        FileOutputStream FOS=new FileOutputStream("C:\\JAVA7\\ASDF1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(FOS);
        oos.writeObject(s0);
        oos.close();
    
    }
}
