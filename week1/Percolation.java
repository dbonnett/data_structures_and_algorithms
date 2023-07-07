import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private int[][] arr;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        arr = new int[n][n];
        int start = -1;
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n * n + 2);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = start;
                start--;
            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        int value = arr[row][col];
        if (value < 0) {
            value = -value;
            // check above
            if (row == 1) {
                
            }
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return arr[row][col] >= 0;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return -1;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    public static void main(String[] args) {
    }
}
