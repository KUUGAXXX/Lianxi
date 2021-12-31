package Jianzhioffer;

import java.util.Stack;

public class Code09 {
    Stack<Integer>stack1,stack2;
    public void CQueue() {
         stack1=new Stack<>();
         stack2=new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }

        if (stack1==null) {
            return -1;
        }
        while (stack1!=null) {
            stack2.push(stack1.pop());
        }
            return stack2.pop();
    }
}
