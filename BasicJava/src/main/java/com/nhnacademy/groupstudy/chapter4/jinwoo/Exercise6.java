package com.nhnacademy.groupstudy.chapter4.jinwoo;

import com.nhnacademy.groupstudy.chapter4.jinwoo.mosaic.*;

/**
 * This program opens a window full of randomly colored squares.  A "disturbance"
 * moves randomly around in the window, randomly changing the color of each
 * square that it visits.  The program runs until the user closes the window.
 */
public class Exercise6 extends MosaicWalk {

    public void start(int rows, int columns, int squareSize) {
        init(rows, columns, squareSize);
        start();
    }

    public void start(){
        Mosaic.open( rows, columns, squareSize, squareSize );
        fillWithBlack();
        currentRow = rows / 2;   // start at center of window
        currentColumn = columns / 2;
        while (true) {
            changeToRandomGreenColor(currentRow, currentColumn);
            randomMove();
            Mosaic.delay(5);
        }
    }  // end main

    protected void fillWithBlack(){
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Mosaic.setColor(row, column, 0, 0, 0);
            }
        }
    }

    protected void changeToRandomGreenColor(int rowNum, int colNum) {
        int green = random.nextInt(256);
        Mosaic.setColor(rowNum,colNum,0,green,0);
    }
}
