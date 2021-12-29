package HotCode;

public class Code2 {

    public static void main(String[] args) {
        ListNode l1=new ListNode(6);
        for (int i = 5; i >0 ; i--) {
            ListNode p=new ListNode(i);//创建一个新的对象——p结点。
            p.next=l1;
            l1=p;
        }
        System.out.println(l1);


        ListNode l2=new ListNode(6);
        for (int i = 5; i >0 ; i--) {
            ListNode p=new ListNode(i);//创建一个新的对象——p结点。
            p.next=l2;
            l2=p;
        }
        System.out.println(l2);

        ListNode result=addTwoNumbers(l1,l2);
    }


        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum=0;
            int carry=0;
            ListNode p=null;
            ListNode head=p;
            while (l1!=null||l2!=null) {
                int n1 = l1 != null ? l1.val : 0;
                int n2 = l2 != null ? l2.val : 0;
                sum=n1+n2+carry;
                carry=sum/10;
                sum=sum%10;
                ListNode result=new ListNode(sum);
                if(head==null){
                    head=p=result;
                }else {
                    p.next = result;
                    p=result;
                }
                if(l1!=null)
                l1=l1.next;
                if(l2!=null)
                l2=l2.next;
            }
//            if(l1==null){
//                while (l2!=null) {
//                    ListNode result = new ListNode((l2.val+carry)%10);
//                    carry=(l2.val+carry)/10;
//                    l2=l2.next;
//                    p.next=result;
//                }
//            }else {
//                while (l1!=null) {
//                    ListNode result = new ListNode((l1.val+carry)%10);
//                    carry=(l1.val+carry)%10;
//                    l1=l1.next;
//                    p.next=result;
//                }
//            }
            if (carry>0){
                p.next=new ListNode(1);
            }
            return head;
        }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

