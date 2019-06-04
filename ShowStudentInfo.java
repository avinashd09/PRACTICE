
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ShowStudentInfo {

    
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException
{
FileInputStream FIS=new FileInputStream("C:\\JAVA7\\ASDF1.txt");
ObjectInputStream OIS=new ObjectInputStream(FIS);
STUDENT0 s01=(STUDENT0)OIS.readObject();
s01.showInfo();
}    
}
