public class Pattern {
    public static void main() {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (char ch = 'A'; ch < 'A' + row; ch++) {
                System.out.print(ch);

            }
            System.out.println();
        }
    }
}

OUTPUT:

A
AB
ABC
ABCD
ABCDE
