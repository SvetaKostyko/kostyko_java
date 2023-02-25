package org.andersen.testtasks;

import java.io.Console;
import java.util.Scanner;

public class HelloViacheslav {

    public static void main(String[] args) {
        String name;
        System.out.println("Введите имя");
        Console console = System.console();
        if (console != null) {
            name = console.readLine();
        } else {
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
        }
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
