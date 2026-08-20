class Solution {
    public static void pattern20(int n) {

        // Upper half
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int row = n - 1; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
