package Banco;

import java.util.Random;
public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long nroCuenta;
    Random randomNum = new Random();
    public CuentaCorriente (String nombreTitular, double saldo)
    {

        this.saldo=saldo;
        this.nombreTitular=nombreTitular;
        this.nroCuenta = Math.abs(randomNum.nextLong());
    }

    public void setIngreso(double ingreso)
    {
        saldo=saldo+ingreso;
    }

    public void setReintegro(double reintegro)
    {
        saldo=saldo-reintegro;
    }

    public double getSaldo()
    {
        return saldo;
    }


    public static void Transferencia (CuentaCorriente c1, CuentaCorriente c2, double importeTransferencia)
    {
        c1.saldo=c1.saldo-importeTransferencia;
        c2.saldo=c2.saldo+importeTransferencia;
    }

}