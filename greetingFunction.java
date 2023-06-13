package lab3;

import java.util.Scanner;


public class Greeting {
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greetUser();
    }
}
