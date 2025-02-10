import java.util.*;

public class Program_1 {

    // Directions for up, down, left, right
    private static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    // Check if a cell is valid
    private static boolean isValid(int x, int y, int N, int M) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

    // Simulate gravity until landing on a stable cell
    private static int simulateGravity(int x, int y, String[][] matrix, int N) {
        while (x + 1 < N && !"B".equals(matrix[x + 1][y])) {
            x++;
        }
        return x;
    }

    // BFS to explore all stable cells reachable within K moves
    private static List<int[]> bfs(int startX, int startY, String[][] matrix, int N, int M, int K) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List<int[]> reachableCells = new ArrayList<>();

        queue.add(new int[]{startX, startY, 0}); // {x, y, moves}
        visited.add(startX + "," + startY);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], moves = current[2];

            // If we've reached a stable cell within K moves
            if ("E".equals(matrix[x][y]) && x != N - 1) { // Skip last row stable cells
                reachableCells.add(new int[]{x, y, moves});
            }

            // Stop if we've exceeded the allowed moves
            if (moves >= K) {
                continue;
            }

            // Explore in all four directions
            for (int[] dir : DIRS) {
                int nx = x + dir[0], ny = y + dir[1];
                String pos = nx + "," + ny;

                if (isValid(nx, ny, N, M) && !visited.contains(pos)) {
                    if (!"B".equals(matrix[nx][ny])) { // Cannot step on 'B'
                        visited.add(pos);
                        int gx = simulateGravity(nx, ny, matrix, N); // Simulate gravity
                        queue.add(new int[]{gx, ny, moves + 1}); // Increment moves
                    }
                }
            }
        }

        return reachableCells;
    }

    // Find the farthest cells by Manhattan Distance
    public static List<int[]> farthestReach(int N, int M, String[][] matrix, int K) {
        int startX = -1, startY = -1;

        // Find the starting position 'S'
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ("S".equals(matrix[i][j])) {
                    startX = i;
                    startY = j;
                    break;
                }
            }
            if (startX != -1) {
                break;
            }
        }

        // Ensure the start position exists
        if (startX == -1 || startY == -1) {
            throw new IllegalArgumentException("Start position 'S' not found in the grid.");
        }

        // Simulate gravity to adjust the start position
        startX = simulateGravity(startX, startY, matrix, N);

        // Use BFS to find all reachable 'E' cells within K moves
        List<int[]> reachableCells = bfs(startX, startY, matrix, N, M, K);

        // Find the farthest cells by Manhattan Distance
        int farthestDistance = -1;
        List<int[]> farthestCells = new ArrayList<>();
        for (int[] cell : reachableCells) {
            int x = cell[0], y = cell[1];
            int manhattanDistance = Math.abs(x - startX) + Math.abs(y - startY);

            if (manhattanDistance > farthestDistance) {
                farthestDistance = manhattanDistance;
                farthestCells.clear();
                farthestCells.add(new int[]{x, y});
            } else if (manhattanDistance == farthestDistance) {
                farthestCells.add(new int[]{x, y});
            }
        }

        return farthestCells;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input grid dimensions
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        // Input grid matrix
        String[][] matrix = new String[N][M];
        for (int i = 0; i < N; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        // Input maximum moves (K)
        int K = scanner.nextInt();

        // Find and print farthest cells
        try {
            List<int[]> farthestCells = farthestReach(N, M, matrix, K);
            for (int[] cell : farthestCells) {
                System.out.println(cell[0] + " " + cell[1]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
