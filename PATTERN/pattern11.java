class Solution {
    public void pattern11(int n) {

        for (int row = 1; row <= n; row++) {

            for (int column = 1; column <= row; column++) {

                if ((row + column) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
}
