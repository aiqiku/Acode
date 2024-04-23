package com.aiqiku.Acode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aiqiku
 * @create 2024/4/20 20:47
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class Leecode54 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }
    public  static List<Integer> spiralOrder(int[][] matrix) {

        if (matrix.length == 0)
            return new ArrayList<Integer>();
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        Integer[] res = new Integer[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right
            if (++t > b) break;
            for (int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom
            if (l > --r) break;
            for (int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left
            if (t > --b) break;
            for (int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top
            if (++l > r) break;
        }
        return Arrays.asList(res);
    }
}
