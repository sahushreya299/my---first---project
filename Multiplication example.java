public class MatrixOperations {
    public static void main(String[] args) {
        // DECLARE x, y : ARRAY [3][3] OF INTEGER
        // (Initializing with sample values)
        int[][] x = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] y = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };

        // --- Task 1: Count even and odd values ---
        int even = 0; // SET even := 0
        int odd = 0;  // SET odd := 0

        // FOR R := 0 TO 2
        for (int r = 0; r < 3; r++) {
            // FOR C := 0 TO 2
            for (int c = 0; c < 3; c++) {
                // IF x[R][C] MOD 2 = 0 THEN
                if (x[r][c] % 2 == 0) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);

        // --- Task 2: Addition of Matrix ---
        int[][] sum = new int[3][3];

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                // Adding elements from matrix x and y
                sum[r][c] = x[r][c] + y[r][c];
            }
        }

        // PRINT SUM
        System.out.println("\nResult of Matrix Addition:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(sum[r][c] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
