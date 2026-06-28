package com.practise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SubstringPrograms {

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


    public static void printAllSubstring(String str){
        for(int i = 0; i< str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static boolean checkIfRotationMatch(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        if((str1 + str1).contains(str2))
            return true;
        return false;
    }
}
