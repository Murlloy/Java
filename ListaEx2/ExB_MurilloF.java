package ListaEx2;

import java.util.Scanner;

public class ExB_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um numero!");
        int n = ler.nextInt();

        ler.close();

        if(n>=0)
            System.out.println("Numero Já é Positivo  :D");
        else{
            System.out.println("Numero Transformado em Positivo!");
            n *= -1;
            System.out.println("Numero Transformado: " + n);
    }
}
}
