class Solution {
    
    public void inMaze(int i,int j,String str,int[][] maze,ArrayList<String> res){
        if(i < 0 || i > maze.length-1 || j < 0 || j > maze[0].length-1)
            return;
        
        if(maze[i][j] != 1) return;   
        if(i == maze.length-1 && j == maze[0].length-1){
            res.add(str);
            return;
        }
        
        //int val = maze[i][j];
        maze[i][j] = 2;
            inMaze(i+1,j,str + "D",maze,res);
            inMaze(i,j-1,str + "L",maze,res);
            inMaze(i,j+1,str + "R",maze,res);
            inMaze(i-1,j,str + "U",maze,res);
            
        
        maze[i][j] = 1;
        //return;
        
    }
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        
        if(maze[0][0] == 1){
            inMaze(0,0,"",maze,res);
        }
        return res;
    }
}