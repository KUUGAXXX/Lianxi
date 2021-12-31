package Jianzhioffer;

public class Code10 {
    public static void main(String[] args) {
        int result=fib(6);
        System.out.println(result);
    }
    public static int fib(int n) {
        int first=0;
        int last=1;
        int sum=0;
        if(n==1){
            return 1;
        }
        for (int i = 2; i <=n; i++) {
            sum=(first+last)%1000000007;
            first=last;
            last=sum;
        }
        return sum;
    }


}
