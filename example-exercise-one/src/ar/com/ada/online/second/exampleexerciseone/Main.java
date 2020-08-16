package ar.com.ada.online.second.exampleexerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int mayor;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese en primer número a evaluar");
        numberOne = keyboard.nextInt();

        System.out.println("Ingrese el segundo número a evaluar");
        numberTwo = keyboard.nextInt();

        if (numberOne > numberTwo) {
            mayor = numberOne;
        } else {
            mayor = numberTwo;
        }

        System.out.println("El número mayor es " + mayor);
    }
}
