public class MatrixAddition {
    public static void main(String args[]) {
        // creating matrix
        int a[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int b[][] = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
        // creating new matrix
        int c[][] = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] + " ");
            }
            System.out.println(); // for new line

        }
    }
}