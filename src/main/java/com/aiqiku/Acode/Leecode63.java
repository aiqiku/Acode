package com.aiqiku.Acode;

/**
 * @author aiqiku
 * @create 2024/4/20 21:22
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * <p>
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 */
public class Leecode63 {//TODO
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
return -1;
    }

    public static int f(int m, int n) {

        return f(m - 1, n) + f(m, n - 1);
    }
}
