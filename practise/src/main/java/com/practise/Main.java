package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String palindromeWord = "madam";
        if (ReverseString.rev(palindromeWord).equals(palindromeWord)) {
            System.out.println("its palindrome");
        } else {
            System.out.println("its not palindrome");
        }

        Map<Character, Integer> map = CountTheString.countUsingHashMap("letters");
        CountTheString.count("letters");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non Repeat = " + entry.getKey());
                break;
            }
        }

        List<Character> listOfDuplicates = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                listOfDuplicates.add(entry.getKey());
            }
        }
        System.out.println("list of Duplicate characters: " + listOfDuplicates);

        CountTheString.removeTheDuplicate("letters");

        System.out.println("Words are anagram ? = " + Anagram.checkIfAnagram("listen",
                "silent"));
        System.out.println("Words are anagram ? = " +
                Anagram.checkIfAnagramWithOneMap("fried", "fired"));
        System.out.println("Words are anagram ? = " +
                Anagram.checkIfAnagramWithOneMap("friEd", "fired"));
        VowelConsonant.findVowelConsonent("Soumyabrata Saha");
        SubstringPrograms.slidingWindow("abcabcabcabc"); // Expected: "abc" or "bca" or "cab" (length 3)

        SubstringPrograms.printAllSubstring("Saha");

        System.out.println("Rotation matches or not : " + SubstringPrograms.checkIfRotationMatch("saha", "hasa"));

        WordInSentenceProgram.capitalizeFirstLetterOfWord("my name is soumyabrata saha");
        WordInSentenceProgram.reverseWordsInSentence("my name is soumyabrata saha");

    }
}
