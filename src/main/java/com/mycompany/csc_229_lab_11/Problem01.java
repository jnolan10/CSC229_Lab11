package com.mycompany.csc_229_lab_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem01 {
    public static String alphabatize(String str){
        char[] charStr = str.toCharArray();
        
        Arrays.sort(charStr);
      
        return new String(charStr);
    }
    
    public static boolean isAnagram(String str1, String str2){
        String str1Sort = alphabatize(str1);
        
        String str2Sort = alphabatize(str2);
        
        if(str1Sort.equals(str2Sort) == true)
        {
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        HashMap<String,List<String>> Anagrams = new HashMap<String, List<String>>();
        
        ArrayList<String> l1 = new ArrayList<String>();
        
    }
}
