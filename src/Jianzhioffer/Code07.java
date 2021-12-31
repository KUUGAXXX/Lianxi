package Jianzhioffer;


import java.util.HashMap;

public class Code07 {
    int[] preorder;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        if(preorder==null||inorder==null){
            return null;
        }
        TreeNode treeNode=new TreeNode(preorder[0]);
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recursive(0,0,inorder.length-1);

    }

    /**
     * @param pre_root_idx  先序遍历的索引
     * @param in_left_idx  中序遍历的索引
     * @param in_right_idx 中序遍历的索引
     */
    public TreeNode recursive(int pre_root_idx,int in_left_idx,int in_right_idx){
        if (in_left_idx > in_right_idx) {
            return null;
        }
        TreeNode node=new TreeNode(preorder[pre_root_idx]);
        // 有了先序的,再根据先序的，在中序中获 当前根的索引
        int idx=map.get(preorder[pre_root_idx]);
        //左子树的根节点就是 左子树的(前序遍历）第一个，就是+1,左边边界就是left，右边边界是中间区分的idx-1
        node.left=recursive(pre_root_idx+1,in_left_idx,idx-1);
        node.right=recursive(pre_root_idx+(idx-in_left_idx)+1,idx+1,in_right_idx);
        return node;
    }

}
