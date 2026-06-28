package com.practise;

public class WordInSentenceProgram {

    public static void capitalizeFirstLetterOfWord(String sentence){
        StringBuilder updatedSentence = new StringBuilder();
        boolean isFirstLetter = true;

        for (char ch : sentence.toCharArray()){

            if(Character.isWhitespace(ch)){
                isFirstLetter = true;
                updatedSentence.append(ch);
            }
            else {
                if(isFirstLetter){
                    updatedSentence.append(Character.toUpperCase(ch));
                    isFirstLetter = false;
                }
                else
                    updatedSentence.append(ch);
            }
        }
        System.out.println(updatedSentence);
    }

    public static void reverseWordsInSentence(String sentence){
        String[] arr = sentence.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--){
            sb.append(arr[i]);
            if(i != 0)
                sb.append(" ");
        }
        sb.append(".");
        System.out.println(sb);
        
    }

}