public class maxvalue
{
    public static void main(String args[])
    {
        int[] arr={4,2,6,9,7};
        int i,max;
        max=arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum value is: "+max);
    }
}
