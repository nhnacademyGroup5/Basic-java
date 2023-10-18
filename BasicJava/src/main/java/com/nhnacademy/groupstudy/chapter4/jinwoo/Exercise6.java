package com.nhnacademy.groupstudy.chapter4.jinwoo;

import com.nhnacademy.groupstudy.chapter4.jinwoo.mosaic.Mosaic;
import java.util.Random;

/**
 * This program opens a window full of randomly colored squares.  A "disturbance"
 * moves randomly around in the window, randomly changing the color of each
 * square that it visits.  The program runs until the user closes the window.
 */
public class Exercise6 {

    static final int ROWS = 40;        // Number of rows in mosaic.
    static final int COLUMNS = 40;     // Number of columns in mosaic.
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
        fillWithBlack();
        currentRow = ROWS / 2;   // start at center of window
        currentColumn = COLUMNS / 2;
        while (true) {
            changeToRandomGreenColor(currentRow, currentColumn);
            randomMove();
            Mosaic.delay(5);
        }
    }  // end main

    static void fillWithBlack(){
        for (int row=0; row < ROWS; row++) {
            for (int column=0; column < COLUMNS; column++) {
                Mosaic.setColor(row, column, 0, 0, 0);
            }
        }
    }

    static void changeToRandomGreenColor(int rowNum, int colNum) {
        int green = random.nextInt(256);
        Mosaic.setColor(rowNum,colNum,0,green,0);
    }

    /**
     * Move the disturbance.
     * Precondition:   The global variables currentRow and currentColumn
     *                 are within the legal range of row and column numbers.
     * Postcondition:  currentRow or currentColumn is changed to one of the
     *                 neighboring positions in the grid -- up, down, left, or
     *                 right from the current position.  If this moves the
     *                 position outside the grid, then it is moved to the
     *                 opposite edge of the grid.
     */
    static void randomMove() {
        int directionNum; // Randomly set to 0, 1, 2, or 3 to choose direction.
        directionNum = random.nextInt(4);
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
