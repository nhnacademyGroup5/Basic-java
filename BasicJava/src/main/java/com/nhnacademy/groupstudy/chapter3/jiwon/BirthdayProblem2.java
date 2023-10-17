package com.nhnacademy.groupstudy.chapter3.jiwon;

public class BirthdayProblem2 {

    public static void main(String[] args) {

        boolean[] used;

        int count;

        int birthdaysFound;   // The number of different birthdays that
        // have been found.

        used = new boolean[365];  // Initially, all entries are false.

        count = 0;

        birthdaysFound = 0;

        while (birthdaysFound < 365) {
            // Select a birthday at random, from 0 to 364.
            // If the birthday has not already been used,
            // add 1 to birthdaysFound.
            int birthday;  // The selected birthday.
            birthday = (int) (Math.random() * 365);
            count++;
            if (used[birthday] == false) {
                birthdaysFound++;
            }
            used[birthday] = true;
        }

        System.out.println(count + " people were checked.");

    }


} // end class BirthdayProblem4


//    public static void main(String[] args) {
//        int[] used = new int[365];
//        int person = 0;
//        while (true) {
//            int birthday = (int) (Math.random() * 365);
//            count++;
//
//
//        }
//
//    }
//}
