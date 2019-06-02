public class Square {

    private double side,area,perimeter;
    
    public void setSide(double s)
    {
    side=s;
    }
    
    public void showArea()
    {
    area=side*side;
    System.out.println(area);
    }
    public void showPerimeter()
    {
    perimeter=4*side;
    System.out.println(perimeter);
    }
}
