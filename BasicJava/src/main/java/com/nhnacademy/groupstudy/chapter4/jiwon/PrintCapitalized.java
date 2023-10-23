package com.nhnacademy.groupstudy.chapter4.jiwon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.text.WordUtils;

public class PrintCapitalized {

    void printcapitalized() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            System.out.print("Input sentence :");
            str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(WordUtils.capitalizeFully(str)); //apache.commons -> 이용


    }


}
