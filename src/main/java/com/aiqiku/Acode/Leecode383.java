package com.aiqiku.Acode;

import java.util.HashMap;

/**
 * @author aiqiku
 * @create 2024/4/20 22:41
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 */
public class Leecode383 {//todo
    public static void main(String[] args) {
       String ransomNote = "a", magazine = "b";
        boolean b = canConstruct(ransomNote, magazine);
        System.out.println("b = " + b);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (hashMap.get(ransomNote.charAt(i)) == null){
                hashMap.put(ransomNote.charAt(i),1);
            }
            hashMap.put(ransomNote.charAt(i),hashMap.get(ransomNote.charAt(i)) + 1);
        }
        for (int j = 0; j < magazine.length(); j++) {
            if (hashMap.get(j) == magazine.charAt(j)){
                hashMap.put(magazine.charAt(j),hashMap.get(magazine.charAt(j)) - 1);
            }
        }
        for (Character character : hashMap.keySet()) {
            if (hashMap.get(character) > 0){
                return false;
            }
        }
        return true;
    }
}
