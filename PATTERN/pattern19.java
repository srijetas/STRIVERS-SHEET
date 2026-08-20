class Solution {
    public static void pattern19(int n) {

        // Upper half
        for (int row = 1; row <= n; row++) {

            // Stars
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }

            // Spaces
            for (int col = 1; col <= 2 * row - 2; col++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int row = 1; row <= n; row++) {

            // Stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Spaces
            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

OUTPUT:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
