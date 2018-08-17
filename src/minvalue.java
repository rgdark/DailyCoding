public class minvalue
{
    public static void main(String args[])
    {
        int[] arr={4,2,6,9,7};
        int i,min;
        min=arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Miniumum value is: "+min);
    }
}
