package Array;
// 最接近的三数之和
//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
//        找出 nums 中的三个整数，使得它们的和与 target 最接近。
//        返回这三个数的和。假定每组输入只存在唯一答案。


public class theMostCloseSum {
    public int threeSumClosest(int[] nums, int target) {
        int[] ret = new int[3];
// 一开始 j,k 设置为从0开始，出错很多
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int ans = nums[i] + nums[j] + nums[k];
                    if (Math.abs(ans - target) < min) {
                        min = Math.abs(ans - target);
                        ret[0] = i;
                        ret[1] = j;
                        ret[2] = k;
                    }
                }
            }
        }
        return nums[ret[0]] + nums[ret[1]] + nums[ret[2]];
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
