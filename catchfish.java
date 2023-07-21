import java.util.*;

 class catchfish {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of row ");
        int row =sc.nextInt();
        System.out.print("Enter no of col ");
        int col =sc.nextInt();
        int arr[][]=new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }

        solution find = new solution();
        System.out.println(+find.findMaxFish(arr)
        );

    }

 }
 
class solution{
    public int countFish(int[][] grid, int startRow, int startCol, boolean[][] visited) {
        int ROW = grid.length;
        int COL = grid[0].length;
 
        Queue<int[]> queue = new LinkedList<>();
        
        visited[startRow][startCol] = true;
        queue.offer(new int[] {startRow, startCol});
        int fishCount = 0;
 
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currRow = curr[0];
            int currCol = curr[1];
 
            // add to fish count
            fishCount+=grid[currRow][currCol];
 
            // System.out.println("Visited node: (" + currRow + ", " + currCol + ") = " + grid[currRow][currCol]);
 
            int[] dRow = {-1, 0, 1, 0};
            int[] dCol = { 0, 1, 0,-1};
 
            // visit neibor 4 directionally
            for(int i = 0; i < dRow.length; i++) {
                int nextRow = currRow + dRow[i];
                int nextCol = currCol + dCol[i];
                
                // skip out-of-bounds / visited nodes / land
                if (nextRow < 0 || nextRow >= ROW || nextCol < 0 || nextCol >= COL || visited[nextRow][nextCol] || grid[nextRow][nextCol] == 0)
                    continue;
 
                // visit the unvisited neibor and add them to queue
                visited[nextRow][nextCol] = true;
                queue.offer(new int[] {nextRow, nextCol});
            }
        }
        return fishCount;
    }
 
    public int findMaxFish(int[][] grid) {
        // nested loop to go over all cells in matrix
        // if reach a water body, perform BFS to gather all the fishes in the pond
        // collect MAX amount of fish and return
        int ROW = grid.length;
        int COL = grid[0].length;
        int MAX_FISH = 0;
        boolean[][] visited = new boolean[ROW][COL];
 
        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++) {
                int cell_val = grid[i][j];
                // perform BFS when see body of water
                if (cell_val > 0 && !visited[i][j]) {
                    // count fishes in pond
                    MAX_FISH = Math.max(MAX_FISH, countFish(grid, i, j, visited));
                }
            }
        }
        return MAX_FISH;
    }


 }
