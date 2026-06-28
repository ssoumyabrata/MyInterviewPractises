package com.practise;

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

  
}
