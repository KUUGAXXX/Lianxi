package Jianzhioffer;

public class Code16 {
    public static int[] printNumbers(int n) {
        int max=1;
        for (int i = 0; i < n; i++) {
            max*=10;
        }
        int[] array=new int[max-1];
        for (int i = 0; i < max-1; i++) {
            array[i]=i+1;
        }
        return array;
    }

    public static void main(String[] args) {
        printNumbers(3);
    }
}
