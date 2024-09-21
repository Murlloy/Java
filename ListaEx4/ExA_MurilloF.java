package ListaEx4;

import java.util.Scanner;

public class ExA_MurilloF {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        String[] nomes = new String[10];
        

        for(int i = 0; i< 10; i++){
            System.out.print("Digite um nome: ");
            nomes[i] = ler.nextLine();
        }

        ler.close();

        for(int i = 0; i<10; i++){
            System.out.println(nomes[i]);
        }

    }
}
