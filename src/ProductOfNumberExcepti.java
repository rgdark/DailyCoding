public class ProductOfNumberExcepti {
    public static void main(String args[]) {
        int[] arr;
        int product;
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] newarr;
        newarr = new int[5];
        for (int i = 0; i < newarr.length; i++) {
            product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    product = product * arr[j];
                }
            }
            newarr[i] = product;
            System.out.println(newarr[i]);
        }
    }
}