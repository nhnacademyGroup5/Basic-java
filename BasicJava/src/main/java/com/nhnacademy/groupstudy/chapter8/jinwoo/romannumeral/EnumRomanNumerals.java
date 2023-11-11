package com.nhnacademy.groupstudy.chapter8.jinwoo.romannumeral;

import java.util.function.Function;
import java.util.function.Predicate;

public enum EnumRomanNumerals {
    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);
    public final int value;

    EnumRomanNumerals(int value){
        this.value = value;
    }

    public static <T> T search(Predicate<EnumRomanNumerals> condition, Function<EnumRomanNumerals, T> function){
        for (EnumRomanNumerals item: EnumRomanNumerals.values()) {
            if(condition.test(item)){
                return function.apply(item);
            }
        }
        throw new NumberFormatException("Cannot find value or numeral");
    }
}
