package com.nhnacademy.groupstudy.chapter4.jiwon;

/**
 * This program opens a window full of randomly colored squares.  A "disturbance"
 * moves randomly around in the window, randomly changing the color of each
 * square that it visits.  The program runs until the user closes the window.
 */
public class RandomMosaicWalk2 {

    final static int ROWS = 20;        // Number of rows in mosaic.
    final static int COLUMNS = 20;     // Number of columns in mosaic.
    final static int SQUARE_SIZE = 20; // Size of each square in mosaic.

    static int currentRow;    // Row currently containing the disturbance.
    static int currentColumn; // Column currently containing disturbance.

    /**
     * The main program creates the window, fills it with random colors,
     * and then moves the disturbances in a random walk around the window
     * as long as the window is open.
     */
    public static void main(String[] args) {
        Mosaic.open(ROWS, COLUMNS, SQUARE_SIZE, SQUARE_SIZE);

        currentRow = ROWS / 2;   // start at center of window
        currentColumn = COLUMNS / 2;
        while (true) {
            changeToRandomColor(currentRow, currentColumn);
            randomMove();
            Mosaic.delay(1);
        }
    }  // end main


    /**
     * Changes one square to a new randomly selected color.
     * Precondition:   The specified rowNum and colNum are in the valid range
     * of row and column numbers.
     * Postcondition:  The square in the specified row and column has
     * been set to a random color.
     *
     * @param rowNum the row number of the square, counting rows down
     *               from 0 at the top
     * @param colNum the column number of the square, counting columns over
     *               from 0 at the left
     */
    static void changeToRandomColor(int rowNum, int colNum) {
        int g = Mosaic.getGreen(rowNum, colNum);
        g += 25;
        if (g > 255) {
            g = 255;
        }
        Mosaic.setColor(rowNum, colNum, 0, g, 0);
//        int green = (int) (256 * Math.random());  //     0 to 255 for red, green,
//
//        Mosaic.setColor(rowNum, colNum, 0, green, 0);
    }  // end changeToRandomColor

    /**
     * Move the disturbance.
     * Precondition:   The global variables currentRow and currentColumn
     * are within the legal range of row and column numbers.
     * Postcondition:  currentRow or currentColumn is changed to one of the
     * neighboring positions in the grid -- up, down, left, or
     * right from the current position.  If this moves the
     * position outside of the grid, then it is moved to the
     * opposite edge of the grid.
     */
    static void randomMove() {
        int directionNum; // Randomly set to 0, 1, 2, or 3 to choose direction.
        directionNum = (int) (4 * Math.random());
        switch (directionNum) {
            case 0: // move up
                currentRow--;
                if (currentRow < 0) { // CurrentRow is outside the mosaic;
                    currentRow = ROWS - 1;   // move it to the opposite edge.
                }
                break;
            case 1:  // move right
                currentColumn++;
                if (currentColumn >= COLUMNS) {
                    currentColumn = 0;
                }
                break;
            case 2:  // move down
                currentRow++;
                if (currentRow >= ROWS) {
                    currentRow = 0;
                }
                break;
            case 3:  // move left
                currentColumn--;
                if (currentColumn < 0) {
                    currentColumn = COLUMNS - 1;
                }
                break;
        }
    }  // end randomMove

} // end class RandomMosaicWalk2