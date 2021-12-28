package test1;
import java.util.Scanner;
import java.util.List;

public class Main5 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        String end=reverseLeftWords(s,n);
        System.out.println(end);

        }
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length())+s.substring(0,n);

    }
}
