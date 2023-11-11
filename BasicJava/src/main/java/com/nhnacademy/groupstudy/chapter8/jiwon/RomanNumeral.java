package com.nhnacademy.groupstudy.chapter8.jiwon;

public enum RomanNumeral {

    M(1000), CM(900), D(500), CD(400), C(100),
    XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

    private final int intValue;

    RomanNumeral(int intValue) {
        this.intValue = intValue;
    }

    public int toInt() {
        return intValue;
    }

    @Override
    public String toString() {
        return name();
    }
}
