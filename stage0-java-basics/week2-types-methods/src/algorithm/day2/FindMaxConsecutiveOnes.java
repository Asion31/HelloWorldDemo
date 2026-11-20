package algorithm.day2;

/**
 * LeetCode 485 最大连续1的个数
 * 知识点：数组遍历、计数器思想、保存历史最大值
 * 1. cur：记录当前连续1的数量，遇到1累加，遇到0清零
 * 2. max：记录遍历过程中出现过的最长连续1长度
 * 3. 坑点：不要相邻比较，容易下标越界；必须分开保存当前值和最大值
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cur++;
                if (cur > max) {
                    max = cur;
                }
            } else {
                cur = 0;
            }
        }
        return max;
    }

    // 测试main方法
    public static void main(String[] args) {
        Solution sol = new Solution();
        // 测试用例1
        int[] nums1 = {1,1,0,1,1,1};
        System.out.println("测试用例1预期：3，实际：" + sol.findMaxConsecutiveOnes(nums1));
        // 测试用例2
        int[] nums2 = {1,0,1,1,0,1};
        System.out.println("测试用例2预期：2，实际：" + sol.findMaxConsecutiveOnes(nums2));
        // 测试用例3：全1
        int[] nums3 = {1,1,1,1};
        System.out.println("测试用例3预期：4，实际：" + sol.findMaxConsecutiveOnes(nums3));
        // 测试用例4：全0
        int[] nums4 = {0,0,0};
        System.out.println("测试用例4预期：0，实际：" + sol.findMaxConsecutiveOnes(nums4));
    }
}
