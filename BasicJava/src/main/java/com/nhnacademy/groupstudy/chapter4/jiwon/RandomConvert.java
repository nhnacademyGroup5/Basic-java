package com.nhnacademy.groupstudy.chapter4.jiwon;


public class RandomConvert {

    final static int ROWS = 10;        // Number of rows in the mosaic.
    final static int COLUMNS = 10;     // Number of columns in the mosaic.
    final static int SQUARE_SIZE = 30; // Size of each square in the mosaic.

    static int row;
    static int col;

    public static void main(String[] args) {

        Mosaic.open(ROWS, COLUMNS, SQUARE_SIZE, SQUARE_SIZE);
        fillWithRandomColors();
        while (true) {
            int randomRow = (int) (ROWS * Math.random());
            int randomColumn = (int) (COLUMNS * Math.random());
            convertRandomNeighbor(randomRow, randomColumn);
            Mosaic.delay(1000);

        }
    }

    static void fillWithRandomColors() {
        for (row = 0; row < ROWS; row++) {
            for (col = 0; col < COLUMNS; col++) {
                int r = (int) (256 * Math.random());
                int g = (int) (256 * Math.random());
                int b = (int) (256 * Math.random());
                Mosaic.setColor(row, col, r, g, b);
            }
        }
    } //해결


    static void convertRandomNeighbor(int row, int col) {
        int red = Mosaic.getRed(row, col);
        int green = Mosaic.getGreen(row, col);
        int blue = Mosaic.getBlue(row, col);

        int directionNum = (int) (4 * Math.random());
        switch (directionNum) {
            case 0: // Choose neighbor above.
                row--; // Move row number one row up.
                if (row < 0) // row number is outside the mosaic.
                {
                    row = ROWS - 1; // Wrap around to the bottom of the mosaic.
                }
                break;
            case 1: // Choose neighbor to the right.
                col++;
                if (col >= COLUMNS) {
                    col = 0;
                }
                break;
            case 2: // Choose neighbor below.
                row++;
                if (row >= ROWS) {
                    row = 0;
                }
                break;
            case 3: // Choose neighbor to the left.
                col--;
                if (col < 0) {
                    col = COLUMNS - 1;
                }

        }
        Mosaic.setColor(row, col, red, green, blue);
    }

}