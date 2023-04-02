package part5;

public class Task24 {
    public static void main(String[] args) {

        int numRows = 5, numCols = 5;
        int i, j;

        int array[][] = new int[numRows][numCols];

        for (i = 0; i < numRows / 2 + 1; i++) {
            for (j = 0; j < numCols; j++) {
                if ((j < i) || (j >= (numCols - i)))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }

        for (i = numRows - 1; i >= numRows / 2 + 1; i--) {
            for (j = 0; j < numCols; j++) {
                if ((j < (numCols - 1 - i)) || (j > i))
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }

        for (i = 0; i < numRows; i++) {
            for (j = 0; j < numCols; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}

