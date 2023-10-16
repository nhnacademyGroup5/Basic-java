package com.nhnacademy.groupstudy.chapter3.yhun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        String word = "";

        for(int i=0; i<line.length(); i++){
            if(checkedChar(line.charAt(i))){
                word = word.concat(line.substring(i, i+1));
            }else{
                if(!word.isEmpty()){
                    sb.append(word).append("\n");
                }
                word = "";
            }
        }

        System.out.println(sb);
    }

    static boolean checkedChar(char ch){
        if(ch == '\'') return true;
        return Character.isLetter(ch);
    }
}
