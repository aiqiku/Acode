package com.aiqiku.Acode;

/**
 * @author aiqiku
 * @create 2024/4/14 21:04
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * [1,1,1,1,1,1,2,2,2,2,2,2,3]
 *
 * 首先我们先让前 2 位直接保留，得到 1,1
 * 对后面的每一位进行继续遍历，能够保留的前提是与当前位置的前面 k 个元素不同（答案中的第一个 1），因此我们会跳过剩余的 1，将第一个 2 追加，得到 1,1,2
 * 继续这个过程，这时候是和答案中的第 2 个 1 进行对比，因此可以得到 1,1,2,2
 * 这时候和答案中的第 1 个 2 比较，只有与其不同的元素能追加到答案，因此剩余的 2 被跳过，3 被追加到答案：1,1,2,2,3
 *
 * 作者：宫水三叶
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/solutions/702970/gong-shui-san-xie-guan-yu-shan-chu-you-x-glnq/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Leecode80 {
    public int removeDuplicates(int[] nums) {
        return process(nums, 2);
    }
    int process(int[] nums, int k) {
        int u = 0;
        for (int x : nums) {
            if (u < k || nums[u - k] != x) nums[u++] = x;
        }
        return u;
    }
}
