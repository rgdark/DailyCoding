import java.util.HashMap;
import java.util.Map;

public class sumoftwo {
    public static void main(String args[])
    {
        int[] myArray = {1,2,3,4,5};
        int target=5;

        twosum(myArray,target);
    }
    public static boolean twosum(int[] nums, int target) {
        if (nums.length == 0 || nums == null)
            return false;

        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (complementMap.containsKey(target - curr)) {
                return true;
            }
            complementMap.put(curr, i);
        }
        return false;
    }
}