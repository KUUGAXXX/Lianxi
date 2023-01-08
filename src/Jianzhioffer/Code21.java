package Jianzhioffer;

import java.util.Stack;

public class Code21 {
    public static int[] exchange(int[] nums) {
        int k=0;
        int len=nums.length;
        int[] result=new int[len];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < len; i++) {
            if(nums[i]%2!=1){
                stack.push(nums[i]);
            }else {
                result[k]=nums[i];
                k++;
            }
        }
        while (stack.size()>0){
            result[k]=stack.pop();
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] s=new int[]{1,2,3,4};
        int[] res=exchange(s);
    }
}
