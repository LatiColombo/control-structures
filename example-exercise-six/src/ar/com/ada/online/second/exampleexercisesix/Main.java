package ar.com.ada.online.second.exampleexercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pax;
        double total;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas");
        pax = keyboard.nextInt();

        if (pax > 300) {
            total = pax * 75;
        } else if (pax > 200) {
            total = pax * 85;
        } else {
            total = pax * 85;
        }

        System.out.println("El total es; " + total);
    }
}
