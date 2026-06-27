package com.practise;

public class ReverseString {
    public static void reverse() {
        String str = "Soumyabrata";
        String rev = "";


        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

        char[] arr = rev.toCharArray();
        char temp;
        int left = 0, right = arr.length-1;
        while(left < right ){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }

        System.out.println(new String(arr));

        System.out.println(rev(new String(arr)));

    }

    static String rev(String str){
        if(str.isEmpty()){
            return str;
        }
        return rev(str.substring(1)) + str.charAt(0);
    }
}