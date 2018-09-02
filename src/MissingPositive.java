public class MissingPositive {
    public static void main(String args[]) {
        int[] arr;
        int max;
        int min;
        int missingno;
        int flag;
        arr = new int[4];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = -1;
        arr[3] = 1;
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > 0 && arr[i] > 0 && min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value" + max);
        System.out.println("Maximum value" + min);

        for (missingno = min + 1; missingno <= max; missingno++) {
            flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > 0 && arr[j] == missingno) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                break;
        }
        System.out.println("Missing lowest positive integer is: " + missingno);
    }
}
