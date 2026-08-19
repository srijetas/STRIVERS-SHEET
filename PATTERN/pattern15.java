class Solution {
    public void pattern15(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print((char)('A' + col - 1));
            }

            System.out.println();
        }
    }
}
