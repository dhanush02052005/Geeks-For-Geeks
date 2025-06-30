class Solution {
    public void dfs(int[][] image, int sr, int sc, int newColor, int originalColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc>=image[0].length || image[sr][sc]!=originalColor){
            return;
        }
        image[sr][sc] = newColor;
        dfs(image,sr+1,sc,newColor,originalColor);
        dfs(image,sr,sc+1,newColor,originalColor);
        dfs(image,sr-1,sc,newColor,originalColor);
        dfs(image,sr,sc-1,newColor,originalColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here
        int originalColor = image[sr][sc];
        if (originalColor == newColor) return image;
        dfs(image,sr,sc,newColor,originalColor);
        return image; 
    }
}