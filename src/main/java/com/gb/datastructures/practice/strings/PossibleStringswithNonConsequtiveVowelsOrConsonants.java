package com.gb.datastructures.practice.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by gbalasubramanian on 01/03/19.
 */
class PossibleStringswithNonConsequtiveVowelsOrConsonants {
    char[] consonants = {'B','C', 'D','F','G', 'H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y', 'Z'};
    char[] vowels = {'A','E','I','O','U'};
    List<String> possibleStrings = new ArrayList<String>();
    public int solution(String S) {
        // write your code in Java SE 8
        int count = 0;
        Set<String> res = new HashSet<>();
        permutate(S,0,S.length()-1);
        for(String ps: possibleStrings) {
            if(!startsWithConsonant(ps)){
                continue;
            }
            boolean isConsequtive = false;
            for(int i =0;i<ps.length()-2;i++) {
                char c1 = ps.charAt(i);
                char c2 = ps.charAt(i+1);
                if(checkTwoConsequtiveVowels(c1,c2) || checkTwoConsequtiveConsonants(c1,c2)){
                    isConsequtive = true;
                    break;
                }
            }
            if(!isConsequtive){
                res.add(ps);
            }
        }
        return res.size();
    }

    boolean checkTwoConsequtiveVowels(char c1, char c2) {
        boolean c1isVowel = false;
        boolean c2isVowel = false;
        for(char vow: vowels) {
            if(vow == c1) {
                c1isVowel = true;
            }
            if(vow == c2) {
                c2isVowel = true;
            }
        }
        return c1isVowel && c2isVowel;
    }

    boolean checkTwoConsequtiveConsonants(char c1, char c2) {
        boolean c1isConsonant = false;
        boolean c2isConsonant = false;
        for(char con: consonants) {
            if(con == c1) {
                c1isConsonant = true;
            }
            if(con == c2) {
                c2isConsonant = true;
            }
        }
        return c1isConsonant && c2isConsonant;
    }


    boolean startsWithConsonant(String s){
        char  c = s.charAt(0);
        for(char c1: vowels){
            if(c == c1) {
                return false;
            }
        }
        return true;
    }

    void permutate(String s, int l, int r) {
        if(l==r){
            possibleStrings.add(s);
        }
        for(int i =l; i<=r;i++){
            s = swap(s,l,i);
            permutate(s,l+1,r);
            s = swap(s,l,i);
        }
    }

    String swap(String s, int i, int j){
        char[] chars = s.toCharArray();
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        PossibleStringswithNonConsequtiveVowelsOrConsonants solution = new PossibleStringswithNonConsequtiveVowelsOrConsonants();
        int n = solution.solution("BAR");
        System.out.println(n);
    }
}
