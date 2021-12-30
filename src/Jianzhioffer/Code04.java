package Jianzhioffer;

public class Code04 {
    public static void main(String[] args) {

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n=matrix.length;
        int m=0;
        if(n>0) {
             m = matrix[0].length;
        }
        if(m==0){
            return false;
        }
        for (int i = 0; i < n; i++) {
            if(target>matrix[i][m-1]){
                continue;
            }else {
                for (int j = 0; j < m; j++) {
                    if(target==matrix[i][j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
