package Banco;

public class Cliente
{

    public static void main(String[] args) {

        CuentaCorriente Cuenta1 = new CuentaCorriente("Mati", 5000);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Bruno", 5000);

        System.out.println("SALDO DE AMBAS CUENTAS:");
        System.out.println(Cuenta1.getSaldo());
        System.out.println(Cuenta2.getSaldo());

        CuentaCorriente.Transferencia(Cuenta1, Cuenta2, 2500);

        System.out.println("SALDO DE AMBAS CUENTAS LUEGO DE TRANSFERIR:");
        System.out.println(Cuenta1.getSaldo());
        System.out.println(Cuenta2.getSaldo());
    }
}