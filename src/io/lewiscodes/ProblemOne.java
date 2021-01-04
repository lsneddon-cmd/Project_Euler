package io.lewiscodes;

/*
 *  Multiples of 3 and 5
 *
 *  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 *  The sum of these multiples is 23.
 *  Find the sum of all the multiples of 3 or 5 below 1000.
 */


import java.util.stream.IntStream;

public class ProblemOne {
    private long sum;

    public ProblemOne() {
        countMultiples();
        printAnswerToConsole();
    }

    private boolean isMultipleOfThreeOrFive(int number) {
        return number % 3 == 0 || number % 5 == number;
    }

    private void countMultiples() {
        this.sum = IntStream.range(3, 1000)
                .filter(this::isMultipleOfThreeOrFive)
                .count();
    }

    private void printAnswerToConsole() {
        System.out.println("Multiples of 3 and 5: " + this.sum);
    }
}
