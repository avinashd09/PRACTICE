public class TestThrow {

    static void validate(int age)
    {
    if(age>=18){
    System.out.println("YOU CAN VOTE");
    }
    else 
    {
        throw new ArithmeticException("NOT VALID");
   
    }
    }
    
    public static void main(String args[]){
    
        validate(18);
         System.out.println("REST OF CODE");
    }
}
