package com.nhnacademy.groupstudy.chapter7.jiwon;

public interface RandomNumberGenerator<T extends Number> {
    T getRandomNumber(T count, T max);
}
