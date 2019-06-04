
import java.io.Serializable;

public class STUDENT0 implements Serializable{
    int r_no;
    String name;
    int marks;
    String post;
    
    public STUDENT0(int r_no,String name,int marks,String post)
    {
    this.r_no=r_no;
    this.name=name;
    this.marks=marks;
    this.post=post;
    }
    public void showInfo()
    {
    System.out.println("ROLL NUMBER "+r_no);
    System.out.println("NAME "+name);
    System.out.println("MARKS "+marks);
    System.out.println("POST "+post);
    }
}
