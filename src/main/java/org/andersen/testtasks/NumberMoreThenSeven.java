package org.andersen.testtasks;

import java.util.Scanner;

public class NumberMoreThenSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}