package algorithm.day1;
import java.util.Arrays;

/**
 * LeetCode 1929 数组串联
 * 题目描述：
 * 给你一个长度为 n 的整数数组 nums。构建长度为 2n 的数组 ans，
 * ans 前半段是 nums，后半段也是 nums，相当于两个nums拼接。
 *
 * 实现思路：
 * 1. 获取原数组长度 n，新建长度 2*n 的结果数组 ans
 * 2. 循环 i，ans[i] = nums[i]，ans[i + n] = nums[i]
 * 3. 返回 ans
 *
 * 测试用例1：nums = {1,2,1} → 输出 [1,2,1,1,2,1]
 * 测试用例2：nums = {1,3,2,1} → 输出 [1,3,2,1,1,3,2,1]
 */
public class GetConcatenation {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        GetConcatenation solution = new GetConcatenation();

        int[] nums1 = {1, 2, 1};
        int[] res1 = solution.getConcatenation(nums1);
        System.out.println("测试用例1答案：" + Arrays.toString(res1));

        int[] nums2 = {1, 3, 2, 1};
        int[] res2 = solution.getConcatenation(nums2);
        System.out.println("测试用例2答案：" + Arrays.toString(res2));
    }
}
