// Q22: [1,2,3,4,5,6,7,8,9,10,11,12] treated as 3x4 grid (row-major)
// Step 1: Value at row=1, col=2 using index = row*cols + col → 7
// Step 2: Sum of row 2 (indices 8-11) → 42
// Step 3: Sum of column 1 (indices 1,5,9) → 18

public class Q22_MatrixAs1D {
  public int[] matrixOps(int[] arr, int rows, int cols) {
    // YOUR SOLUTION HERE
    // return new int[]{valueAt(1,2), sumRow2, sumCol1}
    return new int[]{};
  }

  public static void main(String[] args) {
    Q22_MatrixAs1D sol = new Q22_MatrixAs1D();
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    int[] ans = sol.matrixOps(arr, 3, 4);
    System.out.println("Value at (1,2): " + ans[0]);
    System.out.println("Sum of row 2:   " + ans[1]);
    System.out.println("Sum of col 1:   " + ans[2]);
  }
}
