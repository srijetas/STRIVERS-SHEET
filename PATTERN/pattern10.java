class Solution {
    public void pattern10(int n) {

        // Increasing
        for (int row = 1; row <= n; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Decreasing
        for (int row = n - 1; row >= 1; row--) {

            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
