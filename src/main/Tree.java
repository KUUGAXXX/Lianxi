//package main;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Queue;
//
////声明树节点
//class TreeNode {
//    //树节点的数据域
//    public int data;
//    //左子树
//    public TreeNode left;
//    //右子树
//    public TreeNode right;
//
//    public TreeNode(int data) {
//        this.data = data;
//    }
//}
//
//class Solution {
//    public int maxDepth(TreeNode root) {
//        int max=0;
//        Queue<TreeNode> q=new ArrayDeque<TreeNode>();
//        if(root==null){
//            return 0;
//        }
//        if(root!=null){
//            q.add(root);
//
//        }
//        while(!q.isEmpty()){
//           max++;
//           int n=q.size();
//            for (int i = 0; i <n ; i++) {
//                TreeNode root1=q.poll();
//                if (root1.left != null) q.add(root1.left);
//                if (root1.right != null) q.add(root1.right);
//            }
//
//        }
//
//        return max;
//    }
//}