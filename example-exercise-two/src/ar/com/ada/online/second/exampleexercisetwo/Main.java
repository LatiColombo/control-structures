package ar.com.ada.online.second.exampleexercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        String result;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese un número");
        number = keyboard.nextInt();

        if (number < 0) {
            result = "negativo";
        } else {
            result = "positivo";
        }

        System.out.print("El signo del número es " + result);
    }
}
