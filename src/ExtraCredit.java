public class ExtraCredit
{
    public static int min(int values[])
    {
        int min = values[0];
        for (int n = 0; n < values.length; n++)
        {
            if (values[n] < min)
            {
                min = values[n];
            }
        }
        System.out.printf("\nThe min value is %d.\n", min);
        return min;
    }

    public static int max(int values[])
    {
        int max = values[0];
        for (int n = 0; n < values.length; n++)
        {
            if (values[n] > max)
            {
                max = values[n];
            }
        }
        System.out.printf("\nThe max value is %d.\n", max);
        return max;
    }

    public static void occurenceScan(int[] values, int target)
    {
        int count = 0;
        for (int l = 0; l < values.length; l++)
        {
            if (target == values[l])
            {
                count++;
            }
        }
    }
}
