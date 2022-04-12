import java.util.Scanner;
class Shape
{
    double areac;
    double areas;
    double arear;
    double areat;
    void area(float r)
    {
        areac= 3.14*r*r;
    }
    
    void area(float s,int n)
    {
        areas=s*s;
    }
    
    void area(float l,float b)
    {
        arear=l*b;
    }
    
    void area(float h,float b,int n)
    {
        areat=0.5*h*b;
    }
    
    void show()
    {
        System.out.println("area of circle is");
        System.out.println(areac);
        System.out.println("area of square is");
        System.out.println(areas);
        System.out.println("area of rectangle is");
        System.out.println(arear);
        System.out.println("area of triangle is");
        System.out.println(areat);
    }
}

class Main
{
    static public void main(String args[])
    {
        Shape sh = new Shape();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        float r = sc.nextFloat();
        System.out.println("enter the side");
        float s = sc.nextFloat();
        System.out.println("enter the length and breadth");
        float l = sc.nextFloat();
        float b =  sc.nextFloat();
        System.out.println("enter the height and base");
        float h =  sc.nextFloat();
        float bt =  sc.nextFloat();
        
        sh.area(r);
        sh.area(s,0);
        sh.area(l,b);
        sh.area(h,bt,0);
        sh.show();
    }
}