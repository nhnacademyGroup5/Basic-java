package com.nhnacademy.groupstudy.chapter4.jiwon;

public class PrintCapitalizedExercise4_1 {
    public static void main(String[] args) {
        StreamCapitalize streamCapitalize = new StreamCapitalize();
        PrintCapitalized printCapitalized = new PrintCapitalized();
        printCapitalized.printcapitalized();

        String str = "ndsns !smd mds";
        String capstr = streamCapitalize.streamCapitalize(str);
        System.out.println(capstr);
    }
}
