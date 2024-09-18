package ListaEx3;

import java.util.Scanner;

public class ExB_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Escreva um numero que deseja ver a tabuada: ");
        int n = ler.nextInt();

        ler.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + ": " + (n * i));
        }
    }
}
