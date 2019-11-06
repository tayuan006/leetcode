package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

// 18.4数之和
// 本题有待解决
public class SumOfFourNumber {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // 先进行排序
        // 双指针碰撞法
        // n的平方的复杂度
        LinkedList<List<Integer>> ret = new LinkedList<>();
        if (nums == null || nums.length < 4) {
            return ret;
        }

        int len = nums.length;
        Arrays.sort(nums);
        for(int h = 0; h < len -3; h++) {
            if (nums[0] > 0)
                break;
            if (h > 0 && nums[h] == nums[h - 1]) {
                continue;
            }
            for (int i = h + 1; i < len -2; i ++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right] + nums[h];
                if (sum == target) {
                    ret.add(Arrays.asList(nums[h],nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])                               left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                } else if (sum < target) left ++;
                else if (sum > target) right --;
            }
            }
        }

        return ret;
    }
}
