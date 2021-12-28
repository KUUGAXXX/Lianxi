package main;

public class BinarySearchtree {
    int data;
    BinarySearchtree left;
    BinarySearchtree right;
    public BinarySearchtree(int data){
        this.data=data;
        left=null;
        right=null;
    }

    public void insert(BinarySearchtree root,int data){
        if(root.data<data){
            if(root.right==null){
                root.right=new BinarySearchtree(data);
            }
            else
            {
                insert(root.right,data);
            }
        }
    }
     
}
