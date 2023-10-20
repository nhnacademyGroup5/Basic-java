package com.nhnacademy.groupstudy.chapter4.yhun;

public class Exercise7 {

    static int currentRow;    // Row currently containing the disturbance.
    static int currentColumn; // Column currently containing disturbance.

    public static void main(String[] args) {
        Mosaic.open(30,30,25,25);
        Exercise6.fillWithRandomColors(30, 30);
        currentRow = 10;   // start at center of window
        currentColumn = 10;

        while (true) {
            int r = Mosaic.getRed(currentRow, currentColumn);
            int g = Mosaic.getGreen(currentRow, currentColumn);
            int b = Mosaic.getBlue(currentRow, currentColumn);

//            changeToRandomColor(currentRow, currentColumn);
            move(30, 30);
            Exercise6.userOfChangeColor(currentRow, currentColumn, r, g, b);
            Mosaic.delay(10);  // Remove this line to speed things up!
        }
    }  // end main

    static void move(int c, int r){
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};

        int idx = (int)(Math.random()*4);

        currentRow = currentRow + dx[idx];
        currentColumn = currentColumn + dy[idx];

        if(currentRow < 0) currentRow = r-1;
        if(currentRow >= r) currentRow = 0;

        if(currentColumn < 0) currentColumn = c-1;
        if(currentColumn >= c) currentColumn = 0;
    }


}
