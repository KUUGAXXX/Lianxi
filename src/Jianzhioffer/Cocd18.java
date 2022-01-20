package Jianzhioffer;

public class Cocd18 {
    public static ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            return head.next;
        }
        else {
            ListNode p=head;
            while (head.next!=null){
                if(head.next.val==val){
                    head.next=head.next.next;
                    return p;
                }
                head=head.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //尾插法创建ListNode
        ListNode n1=null;
        for (int i = 0; i < 5; i++) {
            ListNode p=new ListNode(i);
            if(n1==null){
                n1=p;
            }else {
                ListNode temp=n1;
                while (true){
                    if(temp.next==null){
                        break;
                    }
                    temp=temp.next;
                }
                temp.next=p;
            }
        }
        ListNode n2=deleteNode(n1,2);
        System.out.println(n2);
    }

}
