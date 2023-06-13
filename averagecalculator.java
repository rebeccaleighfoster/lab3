package lab3;

import java.util.ArrayList;

public class AverageCalculator {
    public static double calculateAverage(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }
}
