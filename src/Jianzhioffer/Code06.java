package Jianzhioffer;

import java.util.Stack;

public class Code06 {
    public static void main(String[] args) {
        ListNode n1=null;
        for (int i = 5; i > 0; i--) {
            ListNode p=new ListNode(i);
            if(n1==null){
                n1=p;
            }else {
                p.next=n1;
                n1=p;
            }
        }
        int[] result=reversePrint(n1);
        System.out.println(result);
    }
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head=head.next;
        }
        int length=stack.size();
        int[] arr=new int[length];
        int i=0;
        while(!stack.empty()){
            arr[i]=stack.pop();
            i++;
        }
        return arr;
    }
}
