package com.practise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VowelConsonant {

    public static void findVowelConsonent(String str) {

        int v = 0;
        int c = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) == -1)
                c++;
            else
                v++;
        }
        System.out.println(str + " has " + v + " vowels and " + c + " consonants");
    }

    public static void longestSubstringWithoutRepeatChar(String str) {
        Map<Character, Integer> lastSeen = new LinkedHashMap<>();
        int maxLen = 0;
        int start = 0;
        int maxStart = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (lastSeen.containsKey(ch))
                start = Math.max(start, lastSeen.get(ch) + 1);
            lastSeen.put(ch, i);
            if (i - start + 1 > maxLen) {
                maxLen = i - start + i;
                maxStart = start;
            }
        }

        System.out.println(
                "Longest Substring Without Repeating Character is " + str.substring(maxStart, maxStart + maxLen));
    }

    public static void slidingWindow(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int l = 0, r = 0, maxLen = 0;
        int maxStart = l;
        char[] strArr = str.toCharArray();
        List<String> listOfSubstring = new ArrayList<>();

        while (r < str.length()) {
            if (map.containsKey(strArr[r])) {
                  l = map.get(strArr[r])+1;  
            }

            map.put(strArr[r], r);
            if(r-l + 1 > maxLen){
                maxLen = r-l+1;
                maxStart = l;
                listOfSubstring.clear();
                listOfSubstring.add(str.substring(maxStart, maxStart + maxLen));
            }
            else if(r-l+1 == maxLen){
                listOfSubstring.add(str.substring(l, r+1));
            }

            r++;
        }
        System.out.println("List of Substring without repeating chars are : "+listOfSubstring);

    }

}
