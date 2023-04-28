class Solution {
    public static void solve(char[][] board) {
        if(board == null || board.length == 0){
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];
       
        for(int row = 0; row < rows; row++){
            
            dfs_bordersMarkVisited(board, visited, row, 0);
            
            dfs_bordersMarkVisited(board, visited, row, cols-1);
        }

        for(int col = 0; col < cols; col++){
            
            dfs_bordersMarkVisited(board, visited, 0, col);
            
            dfs_bordersMarkVisited(board, visited, rows-1, col);
        }

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(board[row][col] == 'O' && visited[row][col] == false){
                    board[row][col] = 'X';
                }
            }
        }
    }

    private static void dfs_bordersMarkVisited(char[][]board, boolean[][] visited, int row, int col){
        if(!(row >= 0 && row < board.length && col >= 0 && col < board[0].length)){
            return;
        }
        if(board[row][col] == 'X'){ 
            return;
        }
        if(visited[row][col] == true){ 
            return;
        }

        
        visited[row][col] = true;

        
        dfs_bordersMarkVisited(board, visited, row+1, col);
        dfs_bordersMarkVisited(board, visited, row, col+1);
        dfs_bordersMarkVisited(board, visited, row-1, col);
        dfs_bordersMarkVisited(board, visited, row, col-1);
    }
}