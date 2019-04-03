package com.gb.datastructures.practice.dfsbfs;

import java.util.Arrays;

public class Maze {
    private static boolean isValidMove(int[][] maze, int x, int y) {
        if (x >= 0 && x < maze.length  && y >= 0 && y < maze[0].length
            && maze[x][y] == 1)
            return true;
        return false;
    }

    boolean solveMaze(int maze[][]) {
        int solution[][] = new int[maze.length][maze[0].length];
        boolean result = solve(maze, 0, 0, solution);
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
        return result;
    }

    //dfs
    private boolean solve(int[][] maze, int x, int y, int[][] solution) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            solution[x][y] = 1;
            return true;
        }
        if (isValidMove(maze, x, y)) {
            solution[x][y] = 1;
            if (solve(maze, x + 1, y, solution))
                return true;
            if (solve(maze, x, y + 1, solution))
                return true;
            solution[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String args[]) {
        Maze m = new Maze();
        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        m.solveMaze(maze);
    }
}
