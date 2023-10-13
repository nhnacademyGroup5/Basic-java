package com.nhnacademy.groupstudy.section2.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Exercise7 {

    public static void main(String[] args) throws IOException {
        InputStream in = Exercise7.class.getClassLoader().getResourceAsStream("testdata.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String name = br.readLine();
        List<Integer> score = new ArrayList<>();

        score.add(Integer.parseInt(br.readLine()));
        score.add(Integer.parseInt(br.readLine()));
        score.add(Integer.parseInt(br.readLine()));

        double avg;
        int sum = 0;
        sum = score.stream().reduce(sum, (result, data) -> result + data);
        System.out.println("student average : " + (sum)/score.size());

    }

}
