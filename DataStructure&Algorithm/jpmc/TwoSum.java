package jpmc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indexArr = new int[2];
        // traverse the array and try to put it in map for key and value
        for ( int i = 0; i< nums.length; i++) {

            // do target - num
            int value = target - nums[i]; // 9-2 = 7

            if(map.containsKey(value)) {
                indexArr[0] = map.get(value);
                indexArr[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return indexArr;
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 23, -2, -43, 15};
        Arrays.stream(ts.twoSum(nums, 0)).forEach(System.out::println);

        StringBuilder s = new StringBuilder("c");
    }
}
