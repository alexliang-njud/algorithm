package com.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * 给定如下二叉树，以及目标和 sum = 22，
 * Return all the root-to-leaf paths which sum is 22.
 *       5
 *       / \
 *     4   8
 *     /    / \
 *   11  13 4
 *   / \        / \
 * 7  2       5 1
 * 返回:
 * [
 *   [5,4,11,2],
 *   [5,8,4,5]
 * ]
 */
public class PathSumTest {

        public static void getSumPath(TreeNode root,
                                      int sum,
                                      List<Integer> valueList,
                                      int target,
                                      List<List<Integer>> resulList){
            sum = sum + root.value;
            if(sum == target && root.leftChild ==null && root.rightChild==null){
                List<Integer> targetList = new ArrayList(valueList);
                targetList.add(root.value);
                resulList.add(targetList);
                return;
            }
            valueList.add(root.value);
            if(root.leftChild !=null){
                getSumPath(root.leftChild,sum,valueList,target,resulList);
            }
            if(root.rightChild !=null){
                getSumPath(root.rightChild,sum,valueList,target,resulList);
            }

            sum = sum - root.value;
            valueList.remove(valueList.size()-1);
        }


        public static void main(String[] args) {
            TreeNode node1 = new TreeNode(5);
            TreeNode node2 = new TreeNode(4);
            TreeNode node3 = new TreeNode(8);
            node1.leftChild = node2;
            node1.rightChild = node3;
            TreeNode node4 = new TreeNode(11);
            node2.leftChild = node4;
            TreeNode node5 = new TreeNode(13);
            TreeNode node6 = new TreeNode(4);
            node3.leftChild = node5;
            node3.rightChild = node6;
            TreeNode node7 = new TreeNode(7);
            TreeNode node8 = new TreeNode(2);
            node4.leftChild = node7;
            node4.rightChild = node8;
            TreeNode node9 = new TreeNode(5);
            TreeNode node10 = new TreeNode(1);
            node6.leftChild = node9;
            node6.rightChild = node10;

            List<List<Integer>> resulList = new ArrayList<>();
            List<Integer> valueList = new ArrayList<>();
            getSumPath(node1,0, valueList,22,resulList);
            System.out.println(resulList);
        }
}

class TreeNode{
    int value;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int v){
        this.value = v;
    }
}
