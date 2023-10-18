package com.nhnacademy.groupstudy.chapter4.yhun;


public class Exercise6 {
    static int currentRow;    // Row currently containing the disturbance.
    static int currentColumn; // Column currently containing disturbance.

    /**
     * The main program creates the window, fills it with random colors,
     * and then moves the disturbance in a random walk around the window
     * as long as the window is open.
     */
    public static void main(String[] args) {
        Mosaic.open(40,40,25,25);
        fillWithRandomColors(40, 40);
        currentRow = 8;   // start at center of window
        currentColumn = 10;
        while (true) {
            int r = Mosaic.getRed(currentRow, currentColumn);
            int g = Mosaic.getGreen(currentRow, currentColumn);
            int b = Mosaic.getBlue(currentRow, currentColumn);

            userOfChangeColor(currentRow, currentColumn, r, g+25, b);
//            changeToRandomColor(currentRow, currentColumn);
            randomMove(40, 40);
            Mosaic.delay(1);  // Remove this line to speed things up!
        }
    }  // end main

    /**
     * Fills the window with randomly colored squares.
     * Precondition:   The mosaic window is open.
     * Postcondition:  Each square has been set to a random color.
     */
    static void fillWithRandomColors(int r, int c) {
        int row, column;
        for (row=0; row < r; row++) {
            for (column=0; column < c; column++) {
//                userOfChangeColor(row, column, 0, 0, 0);
                changeToRandomColor(row, column);
            }
        }
    }  // end fillWithRandomColors

    /**
     * Changes one square to a new randomly selected color.
     * Precondition:   The specified rowNum and colNum are in the valid range
     *                 of row and column numbers.
     * Postcondition:  The square in the specified row and column has
     *                 been set to a random color.
     * @param rowNum the row number of the square, counting rows down
     *      from 0 at the top
     * @param colNum the column number of the square, counting columns over
     *      from 0 at the left
     */
    static void changeToRandomColor(int rowNum, int colNum) {
        int red = (int)(256*Math.random());    // Choose random levels in range
        int green = (int)(256*Math.random());  //     0 to 255 for red, green,
        int blue = (int)(256*Math.random());   //     and blue color components.
        Mosaic.setColor(rowNum,colNum,red,green,blue);
    }  // end changeToRandomColor

    static void userOfChangeColor(int rowNum, int colNum, int r, int g, int b){
        if(r > 255 || b > 255 || g > 255) return;

        Mosaic.setColor(rowNum,colNum,r,g,b);
    }
    /**
     * Move the disturbance.
     * Precondition:   The global variables currentRow and currentColumn
     *                 are within the legal range of row and column numbers.
     * Postcondition:  currentRow or currentColumn is changed to one of the
     *                 neighboring positions in the grid -- up, down, left, or
     *                 right from the current position.  If this moves the
     *                 position outside of the grid, then it is moved to the
     *                 opposite edge of the grid.
     */
    static void randomMove(int r, int c) {
        int directionNum; // Randomly set to 0, 1, 2, or 3 to choose direction.
        directionNum = (int)(4*Math.random());
        switch (directionNum) {
            case 0:
                currentRow--;
                if (currentRow < 0)   // CurrentRow is outside the mosaic;
                    currentRow = c-1;   // move it to the opposite edge.
                break;
            case 1:
                currentColumn++;
                if (currentColumn >= c)
                    currentColumn = 0;
            case 2:
                currentRow++;
                if (currentRow >= r)
                    currentRow = 0;
                break;
            case 3:
                currentColumn--;
                if (currentColumn < 0)
                    currentColumn = r-1;
                break;

        }
    }  // end randomMove
}
