package ListaEx4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExD_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double[] mA = new double[15];
        double[] mB = new double[15];

        for(int i = 0; i < 15;){

            try{

                System.out.print("Digite um valor: ");
                mA[i] = ler.nextDouble();
                mB[i] = Math.pow(mA[i], 2);

                i++;

            }catch(InputMismatchException e){

                System.out.println("Valor Invalido!!");
                ler.next();

            }
        }

        ler.close();

        for(int i = -1; i < 15; i++){

            if(i == -1)
                System.out.println("Matriz B:");
            else
                System.out.println(i + ": " + mB[i]);

        }

    }
}
