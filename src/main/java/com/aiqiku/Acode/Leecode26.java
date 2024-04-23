package com.aiqiku.Acode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author aiqiku
 * @create 2024/4/14 20:23
 * 26. 删除有序数组中的重复项
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 *
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 *
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。nums = [0,0,1,1,1,2,2,3,3,4]
 */
public class Leecode26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates2(nums);
        Arrays.stream(nums).forEach(value -> System.out.print(value + "\t"));
        System.out.println();
        System.out.println(i);
    }

    /**
     * 快慢指针法
     * @param nums
     * @return
     */
    public static int removeDuplicates1(int[] nums) {
        if (nums.length == 1){
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int slow = 0;
        list.add(slow);
        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[slow] != nums[fast]){

                slow = fast;
                list.add(slow);
            }

        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = nums[list.get(i)];
        }
        return list.size();
    }

    /**
     *
     * @param nums
     * @return
     * nums = [0,0,1,1,1,2,2,3,3,4]
     * nums = [0,1,1,1,2,2,3,3,4]
     */
    public static int removeDuplicates2(int[] nums) {
      int p1 = 1,p2;
        for (p2 = 1; p2 < nums.length; p2++) {
            if (nums[p2] != nums[p2 - 1]){
                nums[p1] = nums[p2];
                p1++;
            }
        }
        return p1;
    }
}
