import java.util.Arrays;

public class Maxarray
{
    public static void main ( String[] args )
    {
        int[] arr = {1 , 298 , 31 , 4 , 0};
        int max = max ( arr );//index number
        rev ( arr );
        System.out.println ( max );
    }

    static int max ( int[] arr )
    {
        int max = arr[0];
        for ( int i = 0 ; i < arr.length ; i++ )
        {
            if ( arr[i] > max )
            {
                max = arr[i];
            }
        }

        return max;

    }

    static void rev ( int[] arr )
    {
        for ( int i = 0 ; i < arr.length / 2 ; i++ )
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println (""+ Arrays.toString ( arr ) );
    }
}
