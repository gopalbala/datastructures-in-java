package com.gb.datastructures.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] inp = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        merge(inp);
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1)
            return intervals;
        List<Output> source = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            source.add(new Output(intervals[i][0], intervals[i][1]));
        }

        source.sort(Comparator.comparing(s -> s.start));

        Output[] output = new Output[source.size()];
        for (int i = 0; i < source.size(); i++) {
            output[i] = (source.get(i));
        }

        int j = 0;

        for (int i = 1; i < output.length; i++) {
            if (output[j].end >= output[i].start) {
                output[j].start = Math.min(output[j].start, output[i].start);
                output[j].end = Math.max(output[i].end, output[j].end);
            } else {
                output[++j] = output[i];
            }
        }


        int[][] res = new int[j + 1][2];
        for (int i = 0; i <= j; i++) {
            res[i][0] = output[i].start;
            res[i][1] = output[i].end;
        }
        return res;
    }

    static class Output {
        int start;
        int end;

        public Output() {

        }

        public Output(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}