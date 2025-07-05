import java.util.*;
public class NumberOfIslands {
    static int m,n;
    static char[][] grid;
    static boolean[][] visited;
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         m = sc.nextInt();
         n = sc.nextInt();
         sc.nextLine();
         grid = new char[m][n];
         visited = new boolean[m][n];
         for(int i=0;i<m;i++){
            String input = sc.nextLine();
            grid[i] = input.toCharArray();
         }
         sc.close();
        System.out.println(numberOfIslands());
        
    }
    public static int numberOfIslands(){
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                       dfs(i,j);
                       count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int i,int j){
    
        if(i < 0|| i>=m|| j<0 || j>=n||grid[i][j]!='1'||visited[i][j]){
            return;
        }
        visited[i][j] = true;
        dfs(i+1,j);
        dfs(i-1,j);
        dfs(i,j+1);
        dfs(i,j-1);
    }
}
