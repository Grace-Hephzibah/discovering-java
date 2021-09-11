class Box
{
    double height, width, depth;

    Box (double h, double w, double d)
    {
        height = h;
        width = w;
        depth = d;
    }

    double volume ()
    {
        return height * width * depth;
    }
}

public class ao_DifferentClass
{
    public static void main(String[] args)
    {
        Box b1 = new Box(2,3,4);
        Box b2 = new Box(5,6,7);

        System.out.println("Volume of a box b1 is " + b1.volume());
        System.out.println("Volume of a box b2 is " + b2.volume());
    }
}
