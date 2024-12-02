package ListaEx4;

import java.util.Scanner;

public class ExE_MurilloF {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int fatorial = 1;

        int[] mA = new int[15];
        int[] mB = new int[15];

        for (int i = 0; i < 15;) {

            try {

                System.out.print("Digite um valor:");
                mA[i] = ler.nextInt();

                fatorial = 1;

                for (int l = 1; l <= mA[i]; l++) {
                    fatorial = fatorial * l;
                }

                mB[i] = fatorial;

                i++;

            } catch (Exception e) {

                System.out.println("Digite um valor valido por favor!!!");
                ler.next();

            }
        }

        ler.close();

        for (int i = -1; i < 15; i++) {
            if (i == -1)
                System.out.println("Matriz B: ");
            else
                System.out.println(i + ": " + mB[i]);
        }

    }
}
