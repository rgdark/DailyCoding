import static java.lang.StrictMath.max;
public class largestSumOfNonAdjacent {
    public static void main(String args[]) {
        int[] myArray = {5,1,1,5};
        for (int i=0;i<myArray.length;i++)
        {
            m(i)=max(m(i-1),m(i-2)+myArray[i]);
        }
    }
    private static int m(int i) {

    }
}
