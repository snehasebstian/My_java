import java.util.*;
class Area
{
     int radius,length, breadth,areaRectangle;
     float pi=3.14f, half=0.5f;
    float base, height, areaCircle,areaTriangle;
	 public static void main(String arg[])
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of Circle as integer");
        int r=sc.nextInt();
        System.out.println("Enter the Length and Breadth of Rectangle as integer");
        int len=sc.nextInt();
        int bre=sc.nextInt();
        System.out.println("Enter the Base and height of Triangle as float");
        float b=sc.nextFloat();       
        float h=sc.nextFloat();
       
        
        Area circle =new Area();
        Area rectangle =new Area();
        Area triangle =new Area();
       
        
        circle.input(r);
        rectangle.input(len,bre);
        triangle.input(b,h);
       
       
        circle.AreaCircle();
        rectangle.AreaRectangle();
        triangle.AreaTriangle();
    }

    Area(int r)
    {
        radius=0;
        length=0;
        breadth=0;
        base=0.0f;
        height=0.0f;
    }

    void input(int r)
    {
        radius=r;
    }

    void input(int l,int b)
    {
        length=l;
        breadth=b;
    }

    void input(float b,float h)
    {
        base=b;
        height=h;
    }
   
    void AreaCircle()
    {
        areaCircle=pi*radius*radius;
        System.out.println("Area of Circle is "+areaCircle );
    }

    void AreaTriangle()
    {
        areaTriangle=half*base*height;
        System.out.println("Area of Triangle is "+areaTriangle   );
    }

    void AreaRectangle()
    {
        areaRectangle=length*breadth;
        System.out.println("Area of Rectangle is "+areaRectangle );
    }
   
}