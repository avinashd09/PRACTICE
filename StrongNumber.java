
import java.util.Scanner;

public class StrongNumber {

    public static void main(String args[])
    {
    int n,sum=0,r,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    n=sc.nextInt();
    t=n;
    while(n!=0)
    {
    r=n%10;
    int fact=1;
    for(int i=1;i<=r;i++)
    {
    fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
    }
    if(sum==t)
    {
    System.out.println("A STRONG NUMBER");
    }
    else
    {
    System.out.println("NOT AN STRONG NUMBER");
    }
    }
}
