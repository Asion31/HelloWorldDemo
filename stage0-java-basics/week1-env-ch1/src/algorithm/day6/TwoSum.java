package algorithm.day6;
import java.util.Arrays;
/**
 * LeetCode 1：两数之和
 * 题目描述：
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 实现思路：暴力双重for循环
 * 1. i 遍历第一个数，j 从 i+1 开始遍历 i后面的数字，避免重复使用同一个元素
 * 2. 判断 nums[i] + nums[j] 是否等于 target
 * 3. 匹配成功直接返回两个下标组成的数组
 *
 * 注意：本版本为暴力解法，时间复杂度 O(n²)；HashMap优化版后续学完集合再写
 * 测试用例1：nums = {2,7,11,15}, target = 9  → 输出下标：0 , 1
 * 测试用例2：nums = {3,2,4}, target = 6    → 输出下标：1 , 2
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] res1 = solution.twoSum(nums1, target1);
        System.out.println("测试用例1答案：" + Arrays.toString(res1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] res2 = solution.twoSum(nums2, target2);
        System.out.println("测试用例2答案：" + Arrays.toString(res2));
    }
}
