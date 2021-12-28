package test;

import java.util.Scanner;

public class Tt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
//        System.out.println(n);
//        System.out.println(m);
        String kk[]=new String[n];
        int k=0;
        while (sc.hasNextLine()) {
            for (int i = 0; i < n; i++) {
                kk[n] = sc.nextLine();
            }
        }

        for (int i = 0; i <n ; i++) {
            if (kk[i]==kk[i+1]) {
                if ((n + 1) % (i + 1) == 0) {
                    k=i;
                   break;
                }
            }
        }
        for (int j = 0; j <k; j++) {
            System.out.println(kk[j]);
        }
    }
}
