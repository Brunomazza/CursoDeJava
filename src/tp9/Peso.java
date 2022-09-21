package tp9;

import java.util.Scanner;

public class CalcularElPeso {


    //Atributos

    private int altura;
    private int peso;
    private String sexo;

    //Metodos

    Scanner Leer = new Scanner(System.in);//Usado para leer por consola

    public void pedirAltura(){
        System.out.println("Ingrese su altura en cm");
        setAltura(Leer.nextInt());
    }

    public void pedirGenero(){
        boolean opcion = true;
        setSexo(Leer.nextLine());
        while (opcion) {

            System.out.println("Ingrese su Genero:\n'h' para hombre\n-'m' para mujer\n");
            setSexo(Leer.nextLine());

            if ((this.sexo.equals("h")) || (this.sexo.equals("m"))){
                opcion = false;
            }else{
                System.out.println("Error: Ingrese una opcion valida");
            }

        }
    }

    public void calcularPeso(){
        if (getSexo()=="h"){
            setPeso(getAltura()-110);
        }
        else{
            setPeso(getAltura()-120);
        }
    }

    public void mostarPeso(){
        System.out.println("Su peso ideal será: "+ getPeso());
    }




    //Setters

    public void setAltura( int altura){
        this.altura = altura;
    }

    public void setSexo (String sexo){
        this.sexo = sexo;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    //Getters

    public int getAltura(){
        return this.altura;
    }

    public  String getSexo(){
        return sexo;
    }

    public int getPeso(){
        return this.peso;
    }

    public static void main (String[] args){

        CalcularElPeso c1 = new CalcularElPeso();

        c1.pedirAltura();
        c1.pedirGenero();
        c1.calcularPeso();
        c1.mostarPeso();


    }







}
