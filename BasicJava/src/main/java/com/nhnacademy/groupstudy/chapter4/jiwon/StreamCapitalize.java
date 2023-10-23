package com.nhnacademy.groupstudy.chapter4.jiwon;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamCapitalize {
    static String streamCapitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Arrays.stream(str.trim()
                        .split("\\s+"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
