package test1;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] k=new int[10];
        for (int i = 0; i < a; i++) {
            int b=in.nextInt();
            int c=in.nextInt();
            int d=b+c;
            k[i]=d;

        }
        for (int i = 0; i <8 ; i++) {
            System.out.println(k[i]);
        }
    }
}