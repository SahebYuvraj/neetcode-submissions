class Solution {

    public static final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int ROWS = grid.length, COLS =grid[0].length;
        int count_islands = 0;

        for (int r = 0; r< ROWS ; r++){
            for (int c = 0;c< COLS;c++){
                if( grid[r][c] == '1'){
                    bfs(grid, r, c);
                    count_islands++;
                }
            }
        }
        return count_islands;
         
        
    }

    private void bfs(char[][] grid, int r, int c){

        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[] {r,c}); // this is like putting a tuple in the list

        while (!q.isEmpty()){ // we found the first position of island
            int[] node = q.poll();
            int row = node[0],col = node[1];

            for (int[] dir:directions){
                int nr = row + dir[0];
                int nc = col + dir[1];

                if(nr>= 0 && nc>=0 && nr<grid.length && nc < grid[0].length && grid[nr][nc] == '1'){
                    q.add(new int [] {nr,nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}
