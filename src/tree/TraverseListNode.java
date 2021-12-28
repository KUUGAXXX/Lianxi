package tree;

public class TraverseListNode {
    public static void main(String[] args) {

    }
    //迭代方法
        void traverse(ListNode head){
        for(ListNode p=head;p!=null;p=p.next){
            // 迭代访问 p.val
        }
    }
    //递归方法
    void traverses(ListNode head) {
        // 递归访问 head.val
        traverses(head.next);
    }
}
class ListNode{
    int val;
    ListNode next;
}
