package com.practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {

    public static boolean checkIfAnagram(String str1, String str2) {
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();

        if (str1.length() != str2.length())
            return false;

        for (char ch : str1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        return map1.equals(map2);
    }

    public static boolean checkIfAnagramWithOneMap(String str1, String str2) {
        Map<Character, Integer> map1 = new LinkedHashMap<>();

        if (str1.length() != str2.length())
            return false;

        for (char ch : str1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            int count = map1.getOrDefault(ch, 0);
            if (count == 0) {
                return false;
            }
            map1.put(ch, count - 1);
        }

        return true;
    }

}
