package ListaEx4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExC_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        // matriz C = A - B

        double[] mA = new double[20];

        double[] mB = new double[20];

        double[] mC = new double[20];

        for(int i = 0; i < 20;){

            try{

                System.out.print("Matriz A - Digite um valor: ");
                mA[i] = ler.nextDouble();

                i++;

            }catch(InputMismatchException e){ //ah e precisa de importar a biblioteca dessa bosta

                System.out.println("Valor Invalido!!");
                ler.next();

            }
        }

        for(int i = 0; i < 20;){

            try{

                System.out.print("Matriz B - Digite um valor: ");
                mB[i] = ler.nextDouble();
                mC[i] = mA[i] - mB[i];

                i++;

            }catch(InputMismatchException e){ //ah e precisa de importar a biblioteca dessa bosta

                System.out.println("Valor Invalido!!");
                ler.next();

            }

        }

        ler.close();

        for(int i = -1; i < 20; i++){

            if(i == -1)
                System.out.println("Matriz C: ");
            else
                System.out.println(i + ": " + mC[i]);

        }


    }

}
