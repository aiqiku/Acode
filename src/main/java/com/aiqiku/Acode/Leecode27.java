package com.aiqiku.Acode;

/**
 * @author aiqiku
 * @create 2024/4/14 19:44
 * 27. 移除元素
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class Leecode27 {
    public static void main(String[] args) {
        int [] a = {0,1,2,2,3,0,4,2};
        int [] a1 = {0};
//        int i1 = removeElement(a, 2);
        int i2 = removeElement(a1, 0);

        for (int i = 0; i < a1.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println(i2);

    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1 - count;) {
            if (val == nums[i]){
                move(nums,i,count);
                count++;
                continue;
            }
            i++;
        }
        return nums.length - count - 1;
    }

    /**
     * 将数组前移
     * @param nums
     * @param index
     */
    public static void move(int[] nums,int index,int count){
        for (int i = index; i < nums.length - 1 - count; i++) {
            nums[i] = nums[i + 1];
        }
    }
}
