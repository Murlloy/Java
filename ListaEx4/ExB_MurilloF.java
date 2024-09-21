package ListaEx4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExB_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int[] mA = new int[8];
        int[] mB = new int[8];

        for(int i = 0; i < 8;){

            try{
                System.out.print("Digite um valor:");
                mA[i] = ler.nextInt();
                mB[i] = mA[i] *3;

                i++;

            }catch(InputMismatchException e){   //utilizado para caso a linha 19 dê erro. (numero diferente de inteiro)
                System.out.println("Digite um valor inteiro!!!");
                ler.next(); //limpa a variavel para evitar o loop infinito

            }

        }

        ler.close();

        for(int i = 0; i < 8; i++){
            System.out.println(i + ": " + mB[i]);
        }

    }
}
