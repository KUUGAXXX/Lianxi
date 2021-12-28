package test;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNextLine()){
            String line=sc.nextLine();
            if(line.length()<8) System.out.println("Irregular password");
            for (int i = 0; i <line.length() ; i++) {
                String kk = "ASDFGHJKLZXCVBNMQWERTYUIOP";
                if (kk.indexOf(line.charAt(i)) != -1) System.out.println("Irregular password");
            }

            for (int i = 0; i <line.length() ; i++) {
                String kk = "asdfghjklzxcvbnmqwertyuiop";
                if (kk.indexOf(line.charAt(i)) != -1) System.out.println("Irregular password");
            }
            System.out.println("OK");
        }
    }
}
