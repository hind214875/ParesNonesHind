/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresNones;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Parte1 {

    public static void main(String[] args) {
        //declarare y initializar variables
        Scanner sc = new Scanner(System.in);
        int opcion, jugadorA, jugadorB, suma;
        boolean esPare = false;
        //pedir informaciones
        do {// un boucle que se repite hasta que el usuario elige Salir

            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");

            System.out.println("elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {//depende que elige el usuario ejecuta el case corresponder del switch
                case 1:
                    /*------------------- Jugar --------------------*/

 /*---------otro menu para que un jugador elege que quiere Pares o Nones---------*/
                    System.out.println("elige que quieres Pares o Nones : ");
                    System.out.println("-------------------------");
                    System.out.println("1.Pares");
                    System.out.println("2.Nones");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            esPare = true;
                            break;

                        case 2:
                            esPare = false;
                            break;

                        default:
                            System.out.println("elige opcion valida");
                    }

                    do {//bucle Que se Repita si el numero de jugadorA menos que 0 o mas que 5
                        System.out.println("JugadorA.elige un numero: ");
                        jugadorA = sc.nextInt();
                    } while (jugadorA < 0 || jugadorA > 5);

                    do {//bucle que se repita si el numero de jugadorB menos que 0 o mas que 5
                        System.out.println("JugadorB.elige un numero: ");
                        jugadorB = sc.nextInt();
                    } while (jugadorB < 0 || jugadorB > 5);

                    suma = jugadorA + jugadorB;
                    if (suma % 2 == 0) {//si suma is pares
                        if (esPare == true) {//
                            System.out.println("el jugador A que gana");
                        }
                    } else {
                        //la suma impares
                        if (esPare == false) {//
                            System.out.println("el jugador A que gana");
                        } else {
                            System.out.println("el jugador B que gana");
                        }

                    }
                    break;
                case 2:
                    System.out.println("Finalizar El Programa");
                    break;
                default:
                    System.out.println("Elege una opcion valida");
            }

        } while (opcion != 2);

    }
}
