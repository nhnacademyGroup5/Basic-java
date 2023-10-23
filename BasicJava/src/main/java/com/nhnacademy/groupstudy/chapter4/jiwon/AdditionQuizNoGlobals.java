package com.nhnacademy.groupstudy.chapter4.jiwon;

public class AdditionQuizNoGlobals {


    public static void main(String[] args) {
        int[] firstNums = new int[10];  // The first numbers in the ten problems
        int[] secondNums = new int[10]; // The second numbers in the ten problems
        int[] answers = new int[10];    // The user's answers.
        System.out.println();
        System.out.println("Welcome to the addition quiz!");
        System.out.println();
        createQuiz(firstNums, secondNums);
        administerQuiz(firstNums, secondNums, answers);
        gradeQuiz(firstNums, secondNums, answers);
    }

    private static void createQuiz(int[] firstNumbers, int[] secondNumbers) {
        for (int i = 0; i < 10; i++) {
            firstNumbers[i] = (int) (Math.random() * 50 + 1);  // in the range 1 to 50
            secondNumbers[i] = (int) (Math.random() * 50); // in the range 0 to 49
        }
    }

    private static void administerQuiz(int[] firstNumbers, int[] secondNumbers, int[] userAnswers) {
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  What is %2d + %2d  ? ",
                    questionNum, firstNumbers[i], secondNumbers[i]);
            userAnswers[i] = TextIO.getlnInt();
        }
    }

    private static void gradeQuiz(int[] firstNumbers, int[] secondNumbers, int[] userAnswers) {
        System.out.println();
        System.out.println("Here are the correct answers:");
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            int correctAnswer = firstNumbers[i] + secondNumbers[i];
            System.out.printf("   Question %2d:  %2d + %2d  =  %2d.  ",
                    questionNum, firstNumbers[i], secondNumbers[i], correctAnswer);
            if (userAnswers[i] == correctAnswer) {
                System.out.println("You were CORRECT.");
                numberCorrect++;
            } else {
                System.out.println("You said " + userAnswers[i] + ", which is INCORRECT.");
            }
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }

}
