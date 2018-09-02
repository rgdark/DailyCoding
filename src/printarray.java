import java.util.Arrays;
import java.util.Scanner;
public class printarray {
    public static void main(String args[])
    {
        int array[],num,i;
        String arraystr;
        arraystr = "";
        System.out.println("Enter the number of array elements");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        System.out.println("Enter the "+num+" elements");
        array=new int[num];
        for(i=0;i<num;i++)
        {
            array[i]=input.nextInt();
        }
        System.out.println("The elements are :"+Arrays.toString(array));
    }
}
