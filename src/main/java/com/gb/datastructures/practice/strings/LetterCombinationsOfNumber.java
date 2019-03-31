package com.gb.datastructures.practice.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfNumber {
    Map<Character, String> map = new HashMap<Character, String>();
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.isEmpty())
            return result;
        dfs(new StringBuilder(), result, 0, digits);
        return result;
    }

    private void dfs(StringBuilder sb, List<String> result, int index, String digits) {
        if(index == digits.length()) {
            result.add(sb.toString());
            return;
        }
        String combinationString = getCombinationString().get(digits.charAt(index));
        for(int i=0;i<combinationString.length();i++) {
            sb.append(combinationString.charAt(i));
            dfs(sb,result,index+1,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    private Map<Character,String> getCombinationString() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        map.put('0', " ");
        return map;
    }

    public static void main(String[] args) {
        LetterCombinationsOfNumber letterCombinationsOfNumber = new LetterCombinationsOfNumber();
        List<String> res =  letterCombinationsOfNumber.letterCombinations("23");
        System.out.println(res);
    }
}
