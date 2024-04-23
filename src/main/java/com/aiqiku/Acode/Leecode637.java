package com.aiqiku.Acode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author aiqiku
 * @create 2024/4/17 21:29
 * 637. 二叉树的层平均值
 * 简单
 * 相关标签
 * 相关企业
 * 给定一个非空二叉树的根节点 root , 以数组的形式返回每一层节点的平均值。与实际答案相差 10-5 以内的答案可以被接受。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[3.00000,14.50000,11.00000]
 * 解释：第 0 层的平均值为 3,第 1 层的平均值为 14.5,第 2 层的平均值为 11 。
 * 因此返回 [3, 14.5, 11] 。
 */
public class Leecode637 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10,
                new TreeNode(20, null, new TreeNode(30, null, null)),
                new TreeNode(40, new TreeNode(50, null, null), null));
        averageOfLevels(treeNode);
    }
    public static List<Double> averageOfLevels(TreeNode root) {
        ArrayDeque<TreeNode> treeNodes = new ArrayDeque<>();
        ArrayList<Double> result = new ArrayList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            TreeNode node = treeNodes.pop();
            System.out.print(node.val + "\t");
            if (node.left != null){
                treeNodes.add(node.left);
            }
            if (node.right != null){
                treeNodes.add(node.right);
            }
        }
        return null;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}