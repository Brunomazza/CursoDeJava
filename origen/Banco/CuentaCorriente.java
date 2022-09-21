package Banco;


import java.util.Random;

public class CuentaCorriente
{
//atributos
    private double saldo;
   private String nombreTitular;
    private long numeroCuenta;

  //ramdom
    Random r = new Random();

    //Constructor
    public CuentaCorriente(String nombreTitular, double saldo)

    {
        this.numeroCuenta = Math.abs(r.nextLong());
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }


//Getters
    public double getSaldo() {
        return saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    //Setters
    public void sacar(double plata)
    {
        this.saldo = saldo - plata;
    }

    public void poner(double plata)
    {
        this.saldo = saldo + plata;
    }

    //Metodos

    public void mostrar()
    {
        System.out.println("Nombre:"+getNombreTitular());
        System.out.println("su numero de cuenta es:"+getNumeroCuenta());
        System.out.println("Su saldo es:"+getSaldo());
    }




    public void trasferencia(double plata, CuentaCorriente c)
    {
      c.poner(plata);

      this.sacar(plata);

    }

}
