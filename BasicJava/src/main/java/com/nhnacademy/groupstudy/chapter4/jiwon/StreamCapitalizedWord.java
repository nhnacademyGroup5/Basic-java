package com.nhnacademy.groupstudy.chapter4.jiwon;

public class StreamCapitalizedWord {

    String streamCapitalized(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
