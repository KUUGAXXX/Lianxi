package Jianzhioffer;
/**
 * BFS广度优先遍历
 * BFS/DFS ： 两者目标都是遍历整个矩阵，不同点在于搜索顺序不同。DFS 是朝一个方向走到底，再回退，以此类推；BFS 则是按照
 * “平推”的方式向前搜索。
 * BFS 实现： 通常利用队列实现广度优先遍历。
 * */

public class Code13 {
    // 棋盘的行列
    int m;
    int n;
    // 记录位置是否被遍历过
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        this.m=m;
        this.n=n;
        visited=new boolean[m][n];
        return dfs(0,0,k);
    }
    public int dfs(int i,int j,int k){
        // i >= m || j >= n是边界条件的判断
        if(i>=m||j>=n
        //visited[m][n]判断这个格子是否被访问过
        ||visited[i][j]==true
        // k < sum(i, j)判断当前格子坐标是否满足条件
        ||sum(i,j)>k){
            return 0;
        }
        // 标注这个格子被访问过
        visited[i][j] = true;
        // 沿着当前格子的右边和下边继续访问
        return 1 + dfs(i + 1, j, k)
                + dfs(i, j + 1, k);

    }

    public int sum(int i,int j){
        int sum=0;
        while (i!=0){
            sum+=i%10;
            i/=10;
        }
        while (j!=0){
            sum+=j%10;
            j/=10;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
