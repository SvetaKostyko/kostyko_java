package org.andersen.testtasks;

import java.util.Scanner;

public class ArrayOfNumbers {
    int[] array;

    public void readArrayFromConsole() {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите размер массива");
            arraySize = scanner.nextInt();
            if (arraySize > 0) {
                break;
            }
            System.out.println("Размер массива должен быть больше 0");
        }
        array = new int[arraySize];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void printFilteredElements() {
        System.out.println("Элементы массива, кратные трем");
        for (int element : array) {
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers();
        arrayOfNumbers.readArrayFromConsole();
        arrayOfNumbers.printFilteredElements();
    }
}