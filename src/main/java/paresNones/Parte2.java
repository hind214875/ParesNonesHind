/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresNones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Parte2 {

    public static void main(String[] args) {
        //declarare y initializar variables
        Scanner sc = new Scanner(System.in);
        int opcion, jugadorA, jugadorB = 0, suma;
        boolean esPare = false;
        Random numeroAleatorio = new Random();//genera numero aleatorio entre 0.0 y 0.99999 el 1 no sale
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
                    do {
                        System.out.println("elige que quieres Pares o Nones : ");
                        System.out.println("-------------------------");
                        System.out.println("1.Pares");
                        System.out.println("2.Nones");
                        System.out.println("3.Parar");
                        opcion = sc.nextInt();

                        switch (opcion) {
                            case 1:
                                esPare = true;
                                break;

                            case 2:
                                esPare = false;
                                break;
                            case 3:
                                System.out.println("Termina");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("elige opcion valida");
                        }

                        do {//bucle Que se Repita si el numero de jugadorA menos que 0 o mas que 10
                            System.out.println("JugadorA.elige un numero: ");
                            jugadorA = sc.nextInt();
                        } while (jugadorA < 0 || jugadorA > 10);

                        // genera numero aleatorio entre 0 y 10 con Classe Random con 10 incluidos 
                        if (esPare == true) {// si el jugador A elige Pare entonces la maquina tiene que coger nones
                            do {//se repita hasta que el numero es impare
                                System.out.println("JugadorB:Introduce un numero: ");
                                jugadorB = numeroAleatorio.nextInt(11);
                                System.out.println(jugadorB);
                            } while (jugadorB % 2 == 0);

                        } else {//el contrario
                            do {
                                System.out.println("JugadorB:Introduce un numero: ");
                                jugadorB = numeroAleatorio.nextInt(11);
                                System.out.println(jugadorB);
                            } while (!(jugadorB % 2 == 0));
                        }
             
                        suma = jugadorA + jugadorB;
                        System.out.println("la suma es :" +suma);
                        if (suma % 2 == 0) {//si suma is pares
                            if (esPare == true) {//y esPare es true entonces jugador A gana
                                System.out.println("el jugador A que gana");
                            }
                        } else {
                            //la suma impares
                            if (esPare == false) {//si esPare es false B pierde entonces A gana
                                System.out.println("el jugador A que gana");
                            } else {//si no B que gana
                                System.out.println("el jugador B que gana");
                            }

                        }
                    } while (opcion == 1 || opcion == 2);//repite el bucle cuando opcion==1 or ==2
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
