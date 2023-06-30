package Clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edadPerro, anosPeerito;
        System.out.print("Ingrese la edad de su perro >> ");
        edadPerro = entrada.nextInt();

        anosPeerito = edadPerro * 7;

        System.out.println("La edad de su perro en años perrunos es : " + anosPeerito);

        // Adivinar un número
        Scanner entradaNumero = new Scanner(System.in);
        int numeroUsuario = 0;
        int numeroAleatorio = (int) Math.floor(Math.random()*10);
        System.out.println(numeroAleatorio);
        System.out.println("¿Cuàl es el número aleatorio?");
        numeroUsuario = entradaNumero.nextInt();

        if(numeroUsuario == numeroAleatorio){
            System.out.println("Adivinaste el número Makui");
        } else {
            System.out.println("número equivocado");
        }

    }
}
