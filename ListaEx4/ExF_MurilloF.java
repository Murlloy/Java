package ListaEx4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExF_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int[] mA = new int[15];

        int[] mB = new int[15];

        int[] mC = new int[30];

        for(int i = 0; i < 15;){

                try {

                    System.out.print("Matriz A - Digite um valor: ");
                    mA[i] = ler.nextInt();
                    mC[i] = mA[i];

                    i++;

                    
                } catch (InputMismatchException e) {

                    System.out.println("Valor Invalido!!");
                    ler.next();

                }
            }

        for(int i = 0; i < 15;){

                try {

                    System.out.print("Matriz B - Digite um valor: ");
                    mB[i] = ler.nextInt();
                    mC[i + 15] = mB[i];

                    i++;

                    
                } catch (InputMismatchException e) {

                    System.out.println("Valor Invalido!!");
                    ler.next();

                }
        }

        for(int i = -1; i < 30; i++){
            if(i == -1)
                System.out.println("Matriz C:");
            else
                System.out.println(i + ": " + mC[i]);


        }

        ler.close();

    }

}
