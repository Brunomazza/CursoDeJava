package Banco;

public class Cliente {

    public static void main(String[] args) {


        CuentaCorriente c1 = new CuentaCorriente("Bruno", 10000);
        CuentaCorriente c2 = new CuentaCorriente("Lucas", 10000);

        c1.mostrar();

        c2.mostrar();



        c1.trasferencia(3000,c2);


         c1.mostrar();

         c2.mostrar();

    }





}
