package com.nhnacademy.groupstudy.chapter8.jiwon;

import java.util.Scanner;

public class FunctionEvaluator {

    public static void main(String[] args) {

        boolean goAgain = false;
        String userInput;      // A line of input read from the user.
        Expr expression;  // The definition of the function f(x).
        double x;         // A value of x for which f(x) is to be calculated.
        double val;       // The value of f(x) for the specified value of x.
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will evaluate a specified function, f(x), at");
        System.out.println("can use the operators +, -, *, /, and ^ as well as mathematical");

        do {
            System.out.println("Enter expression : ");
            userInput = sc.nextLine();
            if (userInput.isEmpty()) {
                break;
            }

            try {
                expression = new Expr(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            while (true) {
                System.out.println("Enter value of X : ");
                userInput = sc.nextLine().trim();
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
                try {
                    x = Double.parseDouble(userInput);
                    val = expression.value(x);

                    if (Double.isNaN(val)) {
                        System.out.println("f(" + x + ") is undefined.");
                    } else {
                        System.out.println("f(" + x + ") = " + val);
                    }
                } catch (NumberFormatException e) {
                    System.out.println(
                            "Invalid input. Please enter a valid number or 'exit' to quit.");
                }

            }

            System.out.println("Enter a new expression? (yes/no): ");
            userInput = sc.nextLine().trim();
            goAgain = userInput.equalsIgnoreCase("yes");
        } while (goAgain);

    }
}
