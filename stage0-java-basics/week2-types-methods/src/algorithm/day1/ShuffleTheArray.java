package algorithm.day1;
import java.util.Arrays;

/**
 * LeetCode 1470 重新排列数组
 * 题目描述：
 * 数组长度2n，前n个是x1~xn，后n个是y1~yn
 * 重排为 [x1,y1,x2,y2,...,xn,yn]
 *
 * 实现思路：
 * 新建长度2n的结果数组ans
 * a 标记偶数位置(0,2,4...)放x；b标记奇数位置(1,3,5...)放y
 * 循环i从0到n-1，每次放一组，a、b都+2
 *
 * 测试用例1：nums = {2,5,1,3,4,7}, n=3 → 输出 [2,3,5,4,1,7]
 * 测试用例2：nums = {1,1,2,2}, n=2 → 输出 [1,2,1,2]
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            ans[a] = nums[i];
            ans[b] = nums[i + n];
            a += 2;
            b += 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        ShuffleTheArray solution = new ShuffleTheArray();
        int[] nums1 = {2,5,1,3,4,7};
        int[] res1 = solution.shuffle(nums1,3);
        System.out.println("测试用例1答案：" + Arrays.toString(res1));

        int[] nums2 = {1,1,2,2};
        int[] res2 = solution.shuffle(nums2,2);
        System.out.println("测试用例2答案：" + Arrays.toString(res2));
    }
}

