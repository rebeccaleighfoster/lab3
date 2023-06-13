package lab3;
import java.util.Scanner;

public class SmallerNumber {
    public static int findSmallerNumber(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int smallerNumber = findSmallerNumber(num1, num2);
        System.out.println("The smaller number is: " + smallerNumber);
    }
}
