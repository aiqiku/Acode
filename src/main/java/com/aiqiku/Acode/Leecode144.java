package com.aiqiku.Acode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aiqiku
 * @create 2024/4/21 9:31
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class Leecode144 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,new TreeNode(4),new TreeNode(7)),
                new TreeNode(3,new TreeNode(5),new TreeNode(6))
        );
        preorderTraversal(root);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode pop = null;//最近一次弹栈的值
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()){
            if (curr != null){
//                list.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            }else {
                TreeNode peek = stack.peek();
                if (peek.right == null || peek.right == pop){
                    pop = stack.pop();
//                    list.add(pop.val);
                    System.out.println(pop.val);
                }else {
                    curr = peek.right;
                }
            }
        }
        return list;
    }


}
