import java.util.*;

public class ac_InputStream_ScannerClass
{
    public static void main(String[] args)
    {
        int a,b,c;

        Scanner S = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        a = S.nextInt();

        System.out.println("Enter the Second Number : ");
        b = S.nextInt();

        c = a+b;

        System.out.println("The sum of the two number is " + c);


    }
}
