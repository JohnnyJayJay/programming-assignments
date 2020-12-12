package edu.kit.programming.assignment2.c;

/**
 * A class representing a two-dimensional arrangement of integers in a square.
 *
 * @author Johnny
 * @version 1.0
 */
public class MagicSquare {

    private final int n;
    private final int magicNumber;
    private final int[][] square;

    private boolean classified;
    private boolean magicSquare;
    private boolean semimagicSquare;

    /**
     * Creates a MagicSquare object based on the given integers.
     *
     * @param square a 2d-array of ints whose contents are expected to be of
     *               the same length as the entire array,
     *               i.e. the array should be of the form int[n][n].
     */
    public MagicSquare(int[][] square) {
        this.n = square.length;
        this.magicNumber = computeMagicNumber(n);
        this.square = square;
        this.classified = false;
    }


    /**
     * Parses the given String to a 2d-array of ints and creates a MagicSquare object based on that.
     *
     * @param s The String to be parsed. Must be of the following format:
     *          row1;row2;row3;... where each row is of the format int1,int2,int2,...
     *
     *          The number of rows must be equal to the number of ints in each row,
     *          all the ints must be valid String representations of ints as defined by
     *          {@link Integer#parseInt(String)} and the String must not contain any whitespace.
     * @return  The new MagicSquare object.
     */
    public static MagicSquare parse(String s) {
        String[] rows = s.split(";");
        int n = rows.length;
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] elements = rows[i].split(",");
            for (int j = 0; j < n; j++) {
                square[i][j] = Integer.parseInt(elements[j]);
            }
        }
        return new MagicSquare(square);
    }

    private void classify() {
        // the square is classified by checking if the row, column and diagonal sums
        // all match the required magic number
        if (checkRows() && checkColumns()) {
            if (checkDiagonals()) {
                magicSquare = true;
            } else {
                semimagicSquare = true;
            }
        }
        classified = true;
    }

    private boolean checkRows() {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int element : square[i]) {
                sum += element;
            }
            if (sum != magicNumber) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumns() {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int[] row : square) {
                sum += row[i];
            }
            if (sum != magicNumber) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonals() {
        // first diagonal (top right - bottom left)
        int sum = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum += square[i][j];
        }

        if (sum != magicNumber) {
            return false;
        }

        // second diagonal (top left - bottom right)
        sum = 0;
        for (int i = 0, j = 0; i < n; i++, j++) {
            sum += square[i][j];
        }

        return sum == magicNumber;
    }

    /**
     * Creates a String containing all the magic numbers for all integers from 1 to the given number.
     *
     * @param k The last number for which a magic number should be computed
     * @return  A String of magic numbers, separated by commas.
     */
    public static String showMagicNumbers(int k) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            builder.append(',').append(computeMagicNumber(i));
        }
        builder.deleteCharAt(0);
        return builder.toString();
    }

    /**
     * Returns whether this square is a magic square.
     *
     * @return {@code true} if the sums of all rows, columns and diagonals are equal.
     */
    public boolean isMagicSquare() {
        if (!classified) {
            classify();
        }
        return magicSquare;
    }

    /**
     * Returns whether this square is a semimagic square.
     *
     * @return {@code true} if the sums of all rows and columns but not all diagonals are equal.
     */
    public boolean isSemimagicSquare() {
        if (!classified) {
            classify();
        }
        return semimagicSquare;
    }

    /**
     * Creates and returns the complement of this square.
     *
     * @return a MagicSquare object representing the complement of this square.
     */
    public MagicSquare complement() {
        int[][] complementSquare = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                complementSquare[i][j] = -square[i][j] + n * n + 1;
            }
        }
        return new MagicSquare(complementSquare);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int[] row : square) {
            for (int element : row) {
                builder.append(element).append(' ');
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.append('\n');
        }
        return builder.toString().trim();
    }

    private static int computeMagicNumber(int n) {
        return (n * n * n + n) / 2;
    }

}
