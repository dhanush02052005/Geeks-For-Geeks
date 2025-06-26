class Solution {
    // Function to find all possible paths
    public void path(int[][] maze , int m , int n , int[][] visited , ArrayList<String> res , String ans){
        if(m < 0 || n < 0 || m >= maze.length || n >= maze[0].length || maze[m][n] == 0 || visited[m][n] == 1){
            return;
        }
        if(m==maze.length-1 && n==maze[0].length-1){
            res.add(ans);
        }
        visited[m][n] = 1;
        path(maze,m-1,n,visited,res,ans + "U");
        path(maze,m,n-1,visited,res,ans + "L");
        path(maze,m+1,n,visited,res,ans + "D");
        path(maze,m,n+1,visited,res,ans + "R");
        visited[m][n] = 0;
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int m = maze.length;
        int n = maze[0].length;
        int[][] visited = new int[m][n];
        ArrayList<String> res = new ArrayList<String>();
        path(maze,0,0,visited,res,"");
        Collections.sort(res);
        return res;
    }
} 