class First
{
    //final void Disp()
    void Disp()
    {
        System.out.println("This is 1st");
    }
}
class aq_Final extends First
{
    void Disp()
    {
        //Super.Disp();
        System.out.println("This is the 2nd");
        // This function cannot be overwritten
    }
    void Fvariable()
    {
        final float pi = 3.14f;
        System.out.println(pi);
    }

    public static void main(String[] args)
    {
        aq_Final f = new aq_Final();
        f.Disp();
    }
}