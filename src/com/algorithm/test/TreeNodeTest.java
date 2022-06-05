package com.algorithm.test;

public class TreeNodeTest {
    public TreeNode findBinaryTree(int[] pre, int preStart, int preEnd, int[] in ,int inStart, int inEnd){
        // 没有符合前序和中序的二叉树或已经到达叶子节点
        if(preStart>preEnd || inStart>inEnd)
            return null;

        // 根节点
        TreeNode root = new TreeNode(pre[preStart]);

        for(int i=inStart;i<=inEnd;i++){
            if(in[i]==pre[preStart]){
                // i-startIn 为左子树个数
                root.left = findBinaryTree(pre, preStart+1, i-inStart+preStart, in, inStart, i-1);
                // (i-startIn+startPre)+1：左子树的下一个开始为右子树
                root.right = findBinaryTree(pre, i-inStart+preStart+1, preEnd, in, i+1, inEnd);
            }
        }
        return root;
    }
    // 重建主函数
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = findBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;
    }

    public String print(TreeNode root) {
        StringBuffer stringBuffer = new StringBuffer();
        print(root.left);
        print(root.right);
        return root.toString();
    }
    public static void main(String[] args) {
        TreeNodeTest test = new TreeNodeTest();
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        System.out.println(test.print(test.reConstructBinaryTree(pre,in)));
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

