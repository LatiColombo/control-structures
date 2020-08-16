package ar.com.ada.online.second.exampleexercisethree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pencilsQ;
        double payment;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de lápices");
        pencilsQ = keyboard.nextInt();

        if (pencilsQ > 1000) {
            payment = pencilsQ * 85;
        } else {
            payment = pencilsQ * 90;
        }

        System.out.println("El pago deberá ser de\n$" + payment);
    }
}
