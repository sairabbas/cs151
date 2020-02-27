public class Arrays
{
    public static void swapLargestAndSmallest(int[] a)
    {
        int small = a[0], smallPos = 0, large = a[0], largePos = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < small)
            {
                small = a[i];
                smallPos = i;
            }
            if (a[i] > large)
            {
                large = a[i];
                largePos = i;
            }
        }
        a[largePos] = small;
        a[smallPos] = large;
    }
}
