package Jianzhioffer;

public class Code12 {
    public boolean exist(char[][] board, String word) {
        boolean result=false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                 result=dfs(board,i,j);
            }
        }
        return result;
    }
    public boolean dfs(char[][]board,int i,int j){
        if(i-1>0){

        }
    }

    public static void main(String[] args) {
        //char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        String[] nums=word.split("");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }
}
