package Clase_7;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Hcer un programa que permita al usuario ingresar 5 números y mostralos.
        int[] numeros = new int[5];
        Scanner entrada = new Scanner(System.in);

        for(int contador = 0 ; contador < numeros.length ; contador++) {
            System.out.println("Ingrese el nùmero en la posiciòn " + (contador + 1) + ": ");
            int numero = entrada.nextInt();
            numeros[contador] = numero;
            //Otra manera de escribir codigo reemplazando las lineas 13 y 14:
            //numeros[contador] = entrada.nextInt();
        }



        int mayor = 0;
        int menor = 0;

        for(int contador = 0 ; contador < numeros.length ; contador++) {
            int num = numeros[contador];
            if(num >= mayor || contador == 0  ) {
                mayor = num;
            }
            if(num <= menor || contador == 0) {
                menor = num;
            }

        }

        System.out.println("Nùmero mayor: " + mayor);
        System.out.println("Nùmero menor : " + menor);

        int sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            sumatoria += num;
        }
        System.out.println("La sumatoria es: " + sumatoria);
        float promedio = (float)sumatoria / numeros.length;
        System.out.println("El promedio es: " + promedio);

        /*contador = 0;

        do {
            System.out.print(numeros[contador]);
            contador++;
        } while(contador < numeros.length);
        */


        /*while (contador < 5) {
            System.out.print(numeros[contador]);
            contador++;
        }*/

    }
}
