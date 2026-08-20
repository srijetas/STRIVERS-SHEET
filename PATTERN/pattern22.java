class Solution {
    public static void pattern22(int n) {

        for (int row = 0; row < 2 * n - 1; row++) {

            for (int col = 0; col < 2 * n - 1; col++) {

                int r = Math.abs(n - 1 - row);
                int c = Math.abs(n - 1 - col);

                System.out.print(Math.max(r, c) + 1 + " ");
            }

            System.out.println();
        }
    }
}

OUTPUT:
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5
