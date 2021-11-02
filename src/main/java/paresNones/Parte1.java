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
        int opcion;
        //pedir informaciones
        do {// un boucle que se repite hasta que el usuario elige Salir

            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");

            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {//depende que elige el usuario ejecuta el case corresponder del switch
                case 1:
                    /*------------------- Jugar --------------------*/

 /*---------otro menu para que un jugador elege que quiere Pares o Nones---------*/
                    System.out.println("Elija que quieres Pares o Nones : ");
                    System.out.println("-------------------------");
                    System.out.println("1.Pares");
                    System.out.println("2.Nones");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            break;

                        case 2:
                            break;
                            
                        default:
                            System.out.println("Elige opcion valida");
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
