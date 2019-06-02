public class Student {

    int r_no;
    String name;

    public void setPersonalData(int r,String s)
    {
    r_no=r;
    name=s;
    }
    public void showData()
    {
    System.out.println(r_no);
    System.out.println(name);
    }
}
    class EngineeringStud extends Student
    {
    String branch;
    int sem;
    
    public void setEngData(String a,int b)
    {
    branch=a;
    sem=b;
    }
    
    public void showEngData()
    {
    System.out.println(branch);
    System.out.println(sem);
    }
    }
    class University extends EngineeringStud
            {
        public static void main(String args[])
        {
               EngineeringStud s=new EngineeringStud();
               s.setPersonalData(101,"AVINASH");
               s.showData();
               s.setEngData("IT", 8);
               s.showEngData();
        }
            }
    


