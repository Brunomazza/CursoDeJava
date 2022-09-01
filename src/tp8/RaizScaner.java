package tp8;

import java.util.Scanner;

public class RaizScaner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double numero, raiz_cuadrada;

        System.out.print("Ingresa el valor de tp10.numero: ");

        numero = in.nextDouble();

        in.nextLine();

        raiz_cuadrada=Math.sqrt(numero);

        System.out.println("Valor de raiz cuadrada: " + raiz_cuadrada);
    }
}
