package com.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountTheString {

    public static Map<Character, Integer> countUsingHashMap(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
        return map;
    }

    public static void count(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }

    public static void removeTheDuplicate(String str) {

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuffer sb = new StringBuffer();
        set.forEach(key -> {
            sb.append(key);
        });

        System.out.println("Removed duplicate letters: " + sb);

        StringBuffer sb1 = new StringBuffer();
        for (char ch : str.toCharArray()) {
            if (sb1.indexOf(ch + "") == -1) {
                sb1.append(ch);
            }
        }

        System.out.println("Removed duplicate letters in Different Way: " + sb1);

    }

}
