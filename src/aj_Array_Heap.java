import java.util.*;

public class aj_Array_Heap {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int arr[] = new int[5];

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