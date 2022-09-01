package tp10;

import java.util.Random;
import javax.swing.JOptionPane;

public class numero
{

    public static void main(String[] args)
    {
     int Aletorio;
     int num1 = 0;

    Random r = new Random();

    Aletorio = (int) (r.nextDouble() * 100);



        while (Aletorio != num1)
        {
            num1 =Integer.parseInt(JOptionPane.showInputDialog("ingrese"));

            if (num1 == Aletorio )
            {
                System.out.println("felicidades el tp10.numero es:"+Aletorio);
            }else
            {
                System.out.println("intente de nuevo");
            }


        }

    }

}