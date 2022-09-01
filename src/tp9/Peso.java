package tp9;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su altura en cm: ");

        float pesoIdeal, altura = sc.nextFloat();

        System.out.print("Ingrese 1 si es hombre y 2 si es mujer: ");

        int genero = sc.nextInt();


        while (genero < 0 || genero > 1) {

            System.out.print("Opción no válida, vuelva a ingresar: ");

            genero = sc.nextInt();
        }

        if (genero == 1) {

            pesoIdeal = altura - 110;

        } else {

            pesoIdeal = altura - 120;
        }

        System.out.println("El peso ideal de la persona es: " + pesoIdeal);

    }
}