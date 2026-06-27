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

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First Non Repeat = "+ entry.getKey());
                break;
            }
        }

        List<Character> listOfDuplicates = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                listOfDuplicates.add(entry.getKey());
            }
        }
        System.out.println("list of Duplicate characters: "+listOfDuplicates);

        CountTheString.removeTheDuplicate("letters");

    }
}





    