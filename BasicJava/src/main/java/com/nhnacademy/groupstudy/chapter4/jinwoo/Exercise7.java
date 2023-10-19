package com.nhnacademy.groupstudy.chapter4.jinwoo;

import com.nhnacademy.groupstudy.chapter4.jinwoo.mosaic.*;
import java.util.stream.IntStream;
import javafx.scene.paint.Color;

/**
 * This program opens a window full of randomly colored squares.  A "disturbance"
 * moves randomly around in the window, randomly changing the color of each
 * square that it visits.  The program runs until the user closes the window.
 */
public class Exercise7 extends MosaicWalk{

    public void start(int rows, int columns, int squareSize) {
        init(rows, columns, squareSize);
        start();
    }

    public void start() {
        Mosaic.open( rows, columns, squareSize, squareSize );
        fillWithRandomColors();
        currentRow = random.nextInt(rows);
        currentColumn = random.nextInt(columns);
        Color infectedColor = Mosaic.getColor(currentRow, currentColumn);
        while (!isAllInfected(infectedColor)) {
            Mosaic.setColor(currentRow, currentColumn, infectedColor);
            randomMove();
            Mosaic.delay(1);
        }
    }  // end main

    protected boolean isAllInfected(Color color){
        return IntStream.range(0, rows)
                .allMatch(row -> IntStream.range(0, columns)
                        .allMatch(column -> Mosaic.getColor(row, column).equals(color)));
    }

} // end class RandomMosaicWalk2
