class Solution {
    public void pattern12(int n) {

        for (int row = 1; row <= n; row++) {

            // Left numbers
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // Spaces
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            // Right numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
