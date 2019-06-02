 class Box {

    double width,height,depth;
    Box()
    {
    width=10;
    height=10;
    depth=10;
    }
    double volume()
    {
    return width*height*depth;
    }
}
public class BoxDemo
        {
public static void main(String args[])
{
Box B1=new Box();
Box B2=new Box();
double vol;
vol=B1.volume();
System.out.println(vol);

vol=B2.volume();
System.out.println(vol);
}
}
   