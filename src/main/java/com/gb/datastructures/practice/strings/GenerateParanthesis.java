package com.gb.datastructures.practice.strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public List<String> generateParenthesis(int n) {
        List<String> paranthesis = new ArrayList<>();
        gen(paranthesis, "", n, n);
        return paranthesis;
    }

    private void gen(List<String> strings, String s, int l, int r) {
        if (l > r)
            return;
        if (l == 0 && r == 0) {
            strings.add(s);
            return;
        }
        if (l > 0) {
            gen(strings, s + "(", l - 1, r);
        }
        if (r > 0) {
            gen(strings, s + ")", l, r - 1);
        }
    }

    public static void main(String[] args) {
        GenerateParanthesis generateParanthesis = new GenerateParanthesis();
        System.out.println( generateParanthesis.generateParenthesis(3));;
    }
}
