class Shape_box
{
    double height, width, depth;

    Shape_box (double h, double w, double d)
    {
        height = h;
        width = w;
        depth = d;
    }

    Shape_box (double h, double w)
    {
        height = h;
        width = w;
    }

    double volume ()
    {
        return height * width * depth;
    }

    double area()
    {
        return height*width;
    }

    void test()
    {
        System.out.println("No Argument");
    }

    void test(int i)
    {
        System.out.println("1 Argument of value : " + i);
    }
}

public class ap_MethodOverloading
{
    public static void main(String[] args)
    {
        Shape_box b1 = new Shape_box(2,3,4);
        Shape_box b2 = new Shape_box(5,6);

        System.out.println("Volume of a box b1 is " + b1.volume());
        System.out.println("Area of a box b2 is " + b2.area());

        System.out.println("Call of the test method");
        System.out.println("No argument call ...");
        b1.test();
        System.out.println("1 argument call ...");
        b1.test(5);
    }
}
