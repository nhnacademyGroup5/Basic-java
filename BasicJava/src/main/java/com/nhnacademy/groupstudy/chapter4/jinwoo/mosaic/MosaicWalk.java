package com.nhnacademy.groupstudy.chapter4.jinwoo.mosaic;

import java.util.Random;

/**
 * This program opens a window full of randomly colored squares.  A "disturbance"
 * moves randomly around in the window, randomly changing the color of each
 * square that it visits.  The program runs until the user closes the window.
 */
public abstract class MosaicWalk {
    protected int rows = 20;       // Number of rows in mosaic.
    protected int columns = 20;
    protected int squareSize = 10;
    protected int currentRow;    // Row currently containing the disturbance.
    protected int currentColumn; // Column currently containing disturbance.
    protected final Random random = new Random();

    public void init(int rows, int columns, int squareSize){
        this.rows = rows;
        this.columns = columns;
        this.squareSize = squareSize;
    }

    public abstract void start();

    /**
     * Fills the window with randomly colored squares.
     * Precondition:   The mosaic window is open.
     * Post-condition:  Each square has been set to a random color.
     */
    protected void fillWithRandomColors() {
        for (int row=0; row < rows; row++) {
            for (int column=0; column < columns; column++) {
                changeToRandomColor(row, column);
            }
        }
    }  // end fillWithRandomColors

    /**
     * Changes one square to a new randomly selected color.
     * Precondition:   The specified rowNum and colNum are in the valid range
     *                 of row and column numbers.
     * Post-condition:  The square in the specified row and column has
     *                 been set to a random color.
     * @param rowNum the row number of the square, counting rows down
     *      from 0 at the top
     * @param colNum the column number of the square, counting columns over
     *      from 0 at the left
     */
    protected void changeToRandomColor(int rowNum, int colNum) {
        int red = random.nextInt(256);    // Choose random levels in range
        int green = random.nextInt(256);  //     0 to 255 for red, green,
        int blue = random.nextInt(256);   //     and blue color components.
        Mosaic.setColor(rowNum,colNum,red,green,blue);
    }  // end changeToRandomColor

    /**
     * Move the disturbance.
     * Precondition:   The global variables currentRow and currentColumn
     *                 are within the legal range of row and column numbers.
     * Post-condition:  currentRow or currentColumn is changed to one of the
     *                 neighboring positions in the grid -- up, down, left, or
     *                 right from the current position.  If this moves the
     *                 position outside the grid, then it is moved to the
     *                 opposite edge of the grid.
     */
    protected void randomMove() {
        int directionNum = random.nextInt(4);
        switch (directionNum) {
            case 0 :
            {  // move up
                currentRow--;
                if (currentRow < 0)
                    currentRow = rows - 1;
                break;
            }
            case 1 :
            {  // move right
                currentColumn++;
                if (currentColumn >= columns)
                    currentColumn = 0;
                break;
            }
            case 2 :
            {  // move down
                currentRow ++;
                if (currentRow >= rows)
                    currentRow = 0;
                break;
            }
            case 3 :
            {  // move left
                currentColumn--;
                if (currentColumn < 0)
                    currentColumn = columns - 1;
                break;
            }
        }
    }  // end randomMove

} // end class RandomMosaicWalk
