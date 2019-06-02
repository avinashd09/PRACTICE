


public class SMDemo {

   static  int a=20;
    
    public static void main(String args[])
    {
    String s="AviNASH  ";
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(s);
    System.out.println(s.trim());
    System.out.println(s.endsWith("  "));
    System.out.println(s.startsWith("A"));
    System.out.println(s.charAt(5));
    System.out.println(s.length());
    String UID="INDORE";
    String PWD="INDORE";
    System.out.println(UID.equals(PWD));
    String s2=String.valueOf(a);
    System.out.println(s2 + 10);
    
    String original="HELLO MY NAME IS AVINASH DAULTANI I AM FROM BURHANPUR THE CITY BURHANPUR IS FAMOUS FOR ITS HISTORICAL MONUMENTS BURHANPUR IS SITUATED NEARED TO SATTE MAHARASHTRA";
    String newString=original.replace("BURHANPUR","INDORE");
    System.out.println(newString);
    String UID1="INDORE";
    String PWD1="indore";
    System.out.println(UID1.equalsIgnoreCase(PWD1));
    
    String s012=original.substring(5);
    System.out.println(s012);
    
    String s3=original.concat(" GOODBYE");
    System.out.println(s3);
   }
}
