package com.nhnacademy.groupstudy.chapter5.jiwon;


public class PairOfDice {

    private int die1;
    private int die2;

    public PairOfDice() {
        roll();
    }

    public void roll() {
        die1 = (int) (Math.random() * 6);
        die2 = (int) (Math.random() * 6);
    }

    public int getTotal() {
        return die1 + die2;
    }

    public int getDie1() {
        return die1;
    }

    public void setDie1(int die1) {
        if (die1 < 1 || die1 > 6) {
            throw new IllegalArgumentException("IllegalARgument");
        }
        this.die1 = die1;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie2(int die2) {
        if (die2 < 1 || die2 > 6) {
            throw new IllegalArgumentException("IllegalARgument");
        }
        this.die2 = die2;
    }

    public String toString() {
        if (die1 == die2) {
            return "double " + die1;
        } else {
            return die1 + " and " + die2;
        }
    }
}

