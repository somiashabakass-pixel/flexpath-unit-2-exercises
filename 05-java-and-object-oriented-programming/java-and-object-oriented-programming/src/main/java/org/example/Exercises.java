package org.example;

public class Exercises {

    // EXAMPLE EXERCISE
    public int addTwoPlusTwo() {
        int x = 2;
        int y = 2;
        return x + y;
    }

    // EXERCISE 1
    public double multiplyPiBy5() {
        double pi = 3.14;
        double result = pi * 5;
        return result;
    }

    // EXERCISE 2
    public String concatenateNameAndAge() {
        String name = "Alice";
        int age = 25;
        String result = name + age;   // "Alice25"
        return result;
    }

    // EXERCISE 3
    public String continueOrEnd() {
        String result = "";
        String prompt = "Do you want to continue?";
        String userInput = "Yes";

        if (userInput.equals("Yes")) {
            result = "The program will continue";
        } else {
            result = "The program will end";
        }

        return result;
    }

    // EXERCISE 4
    public int[] storeIndexInArray() {
        int[] results = {0, 0, 0};

        for (int i = 0; i < results.length; i++) {
            results[i] = i;
        }

        return results;
    }

    // EXERCISE 5
    public int countCorrect() {
        String prompt = "What is our favorite language?";
        String correctAnswer = "Java";
        String[] studentAnswers = {"Python", "Java", "C++"};

        int result = 0;

        for (String answer : studentAnswers) {
            if (answer.equals(correctAnswer)) {
                result++;
            }
        }

        return result;
    }

    // EXERCISE 6
    public int multiply(int x, int y) {
        return x * y;
    }

    // EXERCISE 7
    public int sumArray(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}

