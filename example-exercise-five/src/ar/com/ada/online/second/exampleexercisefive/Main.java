package ar.com.ada.online.second.exampleexercisefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstValue;
        int secondValue;
        int thirdValue;
        int biggestValue;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese un número");
        firstValue = keyboard.nextInt();

        System.out.println("Ingrese otro número");
        secondValue = keyboard.nextInt();

        System.out.println("Ingrese un número más");
        thirdValue = keyboard.nextInt();

        if (firstValue > secondValue) {
            if (firstValue > thirdValue) {
                biggestValue = firstValue;
            } else {
                biggestValue = thirdValue;
            }
        } else if (secondValue > thirdValue) {
            biggestValue = secondValue;
        } else {
            biggestValue = thirdValue;
        }

        System.out.println("El mayor es " + biggestValue);
    }
}
