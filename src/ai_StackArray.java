import java.util.*;

public class ai_StackArray
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int arr[] = {5,10,15,20};

        for(int i=0; i<4; i++)
        {
            System.out.println("Enter a value : ");
            arr[i] = a.nextInt();
        }

        for(int i=0; i<4; i++)
        {
            System.out.println("Array Index "+ i + " : " + arr[i]);
        }
    }
}
