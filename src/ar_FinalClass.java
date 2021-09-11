//final class First
class Sample
{
    public void get()
    {
        System.out.println("Get Method");
    }
}

class ar_FinalClass extends Sample
{
    public void put()
    {
        System.out.println("Put Method");
    }

    public static void main(String[] args)
    {
        ar_FinalClass f = new ar_FinalClass();
        f.get();
        f.put();
    }
}