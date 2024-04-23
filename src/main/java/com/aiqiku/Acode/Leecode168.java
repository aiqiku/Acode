package com.aiqiku.Acode;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.function.BiConsumer;

/**
 * @author aiqiku
 * @create 2024/4/15 20:01
 * 169. 多数元素
 * 简单
 * 相关标签
 * 相关企业
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 */
public class Leecode168 {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,2,2,1,1,1};
        int i = majorityElement(nums);
        System.out.println("i = " + i);
    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashtable = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            if (hashtable.get(num) == null){
                hashtable.put(num,1);
                result = 1;
                continue;
            }

            hashtable.put(num, hashtable.get(num) + 1);
            if (hashtable.get(num) > nums.length / 2){
                result = num;
                break;
            }
        }
        return result;
    }
}
