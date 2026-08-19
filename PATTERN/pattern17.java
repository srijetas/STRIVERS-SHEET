class Solution {
    public void pattern17(int n) {

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Increasing characters
            for (int col = 1; col <= row; col++) {
                System.out.print((char)('A' + col - 1));
            }

            // Decreasing characters
            for (int col = row - 1; col >= 1; col--) {
                System.out.print((char)('A' + col - 1));
            }

            System.out.println();
        }
    }
}
