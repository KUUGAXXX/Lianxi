package Jianzhioffer;

public class Code24 {
    public ListNode reverseList(ListNode head) {
        return recur(head,null);
    }
    public static ListNode recur(ListNode node,ListNode val){
        if(node==null){
            return val;
        }
        ListNode res=recur(node.next,node);
        node.next=val;
        return res;
    }
}
