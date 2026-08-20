class Solution {
    public static void pattern18(int n) {

        for (int row = 1; row <= n; row++) {

            for (int col = n - row; col < n; col++) {
                System.out.print((char)('A' + col) + " ");
            }

            System.out.println();
        }
    }
}

OUTPUT:

E 
D E 
C D E 
B C D E 
A B C D E
