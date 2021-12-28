package tree;

public class Traverse {
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,2,3};
        Traverse.traverses(arr);
    }

    static void traverses(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 迭代访问 arr[i]
            System.out.println(arr[i]);
        }
    }
}
