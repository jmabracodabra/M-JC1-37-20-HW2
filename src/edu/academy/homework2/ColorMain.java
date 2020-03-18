package edu.academy.homework2;

import java.util.Scanner;

public class ColorMain {
    public static void main(String[] args) {
        System.out.println("Please, enter a number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Color color = new Color(num);
        System.out.println("color name is " + color.getName() + ", color number is " + color.getNumber());
    }
}
