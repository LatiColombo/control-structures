package ar.com.ada.online.second.exampleexercisefour;

import java.util.Scanner;

// Almacenes "El harapiento distinguido" tiene una promoción: a todos los trajes que tienen un precio superior a
// $2500 se les aplicará un descuento del 15%, a todos los demás se les aplicará sólo 8%. Realice un algoritmo para
// determinar el precio final que debe pagar una persona por comprar un traje y de cuánto es el descuento que obtendrá.


public class Main {

    public static void main(String[] args) {
        double suitCost;
        double discount;
        double price;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el costo del traje");
        suitCost = keyboard.nextDouble();

        if (suitCost > 2500) {
            discount = suitCost * 0.15;
        } else {
            discount = suitCost * 0.08;
        }

        price = suitCost - discount;

        System.out.println("El precio del traje será de $" + price);
    }
}
