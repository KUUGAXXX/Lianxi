package test1;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i <a ; i++) {
            int n=in.nextInt();
            int m=in.nextInt();
            int x,y=0;
            if(n%2==0){x=n/2;}
            else {x=(n+1)/2;}
            if(m%2==0){y=n/2;}
            else {y=(n+1)/2;}
            int two=test(n)*test(m)/(test(x)*test(y))+test(n)*test(n)/(test(n-x)*test(m-y));
            int one=test(m)*test(n)/(test(y)*test(n-x))+test(n)*test(m)/(test(m-y)*test(x));
            int end=gcd(two,one);
            System.out.println(two/end+"/"+one/end);
           in.nextLine();
        }
    }

    public static int test(int k)
    {
        int max=0;
        for (int i = 1; i <=k ; i++) {
            max=max+i;
        }
        return max;
    }

    public static int gcd(int x,int y)
    {
        //辗转相除法
        if(y==0) return x;
        else
            return gcd(y,x%y);

    }
}
