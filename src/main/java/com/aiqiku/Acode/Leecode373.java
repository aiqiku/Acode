package com.aiqiku.Acode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author aiqiku
 * @create 2024/4/19 21:19
 * 373. 查找和最小的 K 对数字
 * 中等
 * 相关标签
 * 相关企业
 * 给定两个以 非递减顺序排列 的整数数组 nums1 和 nums2 , 以及一个整数 k 。
 *
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2 。
 *
 * 请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 * 输出: [1,2],[1,4],[1,6]
 * 解释: 返回序列中的前 3 对数：
 *      [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 * 示例 2:
 *
 * 输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
 * 输出: [1,1],[1,1]
 * 解释: 返回序列中的前 2 对数：
 *      [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 *      解法:小顶堆
 */
public class Leecode373 {
    public static void main(String[] args) {
        int[] nums1 = {1,7,11};
        int[] nums2 = {2,4,6};
        List<List<Integer>> lists = kSmallestPairs(nums1, nums2, 3);
        System.out.println(lists);
    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length, m = nums2.length;
        var ans = new ArrayList<List<Integer>>(k); // 预分配空间
        var pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{nums1[0] + nums2[0], 0, 0});
        while (!pq.isEmpty() && ans.size() < k) {
            var p = pq.poll();
            int i = p[1], j = p[2];
            ans.add(List.of(nums1[i], nums2[j]));
            if (j == 0 && i + 1 < n)
                pq.add(new int[]{nums1[i + 1] + nums2[0], i + 1, 0});
            if (j + 1 < m)
                pq.add(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
        }
        return ans;
    }

}
