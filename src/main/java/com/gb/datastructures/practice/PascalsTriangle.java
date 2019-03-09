package com.gb.datastructures.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0)
            return triangle;
        List<Integer> previosuStep = new ArrayList<>();
        previosuStep.add(1);
        triangle.add(previosuStep);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> currentStep = new ArrayList<>();
            currentStep.add(1);
            for (int j=0;j<previosuStep.size()-1;j++){
                currentStep.add(previosuStep.get(j)+previosuStep.get(j+1));
            }
            currentStep.add(1);
            triangle.add(currentStep);
            previosuStep = currentStep;
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> triangle = pascalsTriangle.generate(4);
        System.out.println(triangle);
    }
}
