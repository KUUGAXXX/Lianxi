package tree;

public class traverseTreeNode {
    public static void main(String[] args) {
    }
    static void traverse(TreeNode root){
        traverse(root.leftNode);
        traverse(root.rightNode);
    }
}

class TreeNode{
    int val;
    TreeNode leftNode,rightNode;
}
