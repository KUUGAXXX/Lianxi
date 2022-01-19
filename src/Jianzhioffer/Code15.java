package Jianzhioffer;

import java.util.Stack;

public class Code15 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int result=0;
        while (n != 0) {
            result+=n&1;
            n>>>=1;
        }
        return result;
        }

    public static void main(String[] args) {
        int kkk=hammingWeight(1);
        System.out.println(kkk);
    }
}
