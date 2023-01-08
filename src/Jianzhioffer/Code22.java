package Jianzhioffer;

public class Code22 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        int n=1;
        ListNode point=head;
        ListNode res=head;
        while (point.next!=null){
            point=point.next;
            n++;
        }
        if (n==k){
            return head;
        }
        int result=n-k;
        while (result!=0){
            if(res.next==null){break;}
            res=res.next;
            result--;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode n1=null;
        for (int i = 0; i < 2; i++) {
            ListNode p=new ListNode(i+1);
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
        ListNode res= getKthFromEnd(n1,1);
        System.out.println(res);
    }
}
