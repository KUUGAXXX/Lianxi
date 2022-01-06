package Jianzhioffer;

public class Code12 {
    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        boolean result=false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                result=dfs(board,words,i,j,0);
                if(result)return true;
            }
        }
        return false;
    }

    public  static boolean dfs(char[][]board,char[] nums,int i,int j,int k){
        // 越界、或者字符不匹配
        if(i>=board.length||i<0||j>=board[0].length||j<0||board[i][j]!=nums[k]){
            return false;
        }
        // 索引等于单词长度-1，说明全匹配上了
        if(k==nums.length-1){
            return true;
        }
        // 将当前字符设置为空，防止四个方向dfs再次遍历到
        board[i][j] = '\0';
        boolean result =dfs(board, nums, i + 1, j, k + 1)||dfs(board, nums, i-1 , j, k + 1)
                ||dfs(board, nums, i, j+1, k + 1)||dfs(board, nums, i, j -1, k + 1);
        // 恢复当前字符
        board[i][j]=nums[k];
        return  result;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean result=exist(board,word);
        System.out.println(result);
//        String[] nums=word.split("");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }
}
