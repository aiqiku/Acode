package com.aiqiku.Acode;

/**
 * @author aiqiku
 * @create 2024/4/16 22:08
 * 205. 同构字符串
 * 简单
 * 相关标签
 * 相关企业
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 *
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 *
 *
 *
 * 示例 1:
 *
 * 输入：s = "egg", t = "add"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "foo", t = "bar"
 * 输出：false
 * 示例 3：
 *
 * 输入：s = "paper", t = "title"  12134 12134
 * 输出：true
 * 采用映射法 s = "egg", t = "add" 122 122
 *
 */
public class Leecode205 {
    public static void main(String[] args) {
        String s = "paper", t = "title2";
        boolean isomorphic = isIsomorphic(s, t);
        System.out.println("isomorphic = " + isomorphic);
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
