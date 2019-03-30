package com.gb.datastructures.practice;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length -1;
        int res = 0;
        while(low<high){
            System.out.println("low: " + height[low] +" high: "+height[high] +" " + Math.min(height[low], height[high]) * (high-low));
            res = Math.max(res,Math.min(height[low], height[high]) * (high-low));
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int res = containerWithMostWater.maxArea(heights);
        System.out.println(res);
    }
}
