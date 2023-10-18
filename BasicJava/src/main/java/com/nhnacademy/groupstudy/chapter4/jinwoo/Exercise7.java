package com.nhnacademy.groupstudy.chapter4.jinwoo;

import com.nhnacademy.groupstudy.chapter4.jinwoo.mosaic.Mosaic;
import java.util.Random;
import java.util.stream.IntStream;
import javafx.scene.paint.Color;

/**
 * This program opens a window full of randomly colored squares.  A "disturbance"
 * moves randomly around in the window, randomly changing the color of each
 * square that it visits.  The program runs until the user closes the window.
 */
public class Exercise7 {

    static final int ROWS = 20;        // Number of rows in mosaic.
    static final int COLUMNS = 20;     // Number of columns in mosaic.
    static final int SQUARE_SIZE = 10; // Size of each square in mosaic.
    static final Random random = new Random();

    static int currentRow;    // Row currently containing the disturbance.
    static int currentColumn; // Column currently containing disturbance.

    /**
     * The main program creates the window, fills it with random colors,
     * and then moves the disturbances in a random walk around the window
     * as long as the window is open.
     */
    public static void main(String[] args) {
        Mosaic.open( ROWS, COLUMNS, SQUARE_SIZE, SQUARE_SIZE );
        fillWithRandomColors();
        currentRow = random.nextInt(ROWS);
        currentColumn = random.nextInt(COLUMNS);
        Color infectedColor = Mosaic.getColor(currentRow, currentColumn);
        while (!isAllInfected(infectedColor)) {
            Mosaic.setColor(currentRow, currentColumn, infectedColor);
            randomMove();
            Mosaic.delay(5);
        }
    }  // end main

    static boolean isAllInfected(Color color){
        for (int row=0; row < ROWS; row++) {
            for (int column=0; column < COLUMNS; column++) {
                if(!Mosaic.getColor(row, column).equals(color))
                    return false;
            }
        }
        return true;
    }

    /**
     * Fills the window with randomly colored squares.
     * Precondition:   The mosaic window is open.
     * Post-condition:  Each square has been set to a random color.
     */
    static void fillWithRandomColors() {
        for (int row=0; row < ROWS; row++) {
            for (int column=0; column < COLUMNS; column++) {
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
    static void changeToRandomColor(int rowNum, int colNum) {
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
    static void randomMove() {
        int directionNum = random.nextInt(4);
        switch (directionNum) {
            case 0 :
            {  // move up
                currentRow--;
                if (currentRow < 0)
                    currentRow = ROWS - 1;
                break;
            }
            case 1 :
            {  // move right
                currentColumn++;
                if (currentColumn >= COLUMNS)
                    currentColumn = 0;
                break;
            }
            case 2 :
            {  // move down
                currentRow ++;
                if (currentRow >= ROWS)
                    currentRow = 0;
                break;
            }
            case 3 :
            {  // move left
                currentColumn--;
                if (currentColumn < 0)
                    currentColumn = COLUMNS - 1;
                break;
            }
        }
    }  // end randomMove

} // end class RandomMosaicWalk2
