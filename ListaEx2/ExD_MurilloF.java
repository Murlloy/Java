package ListaEx2;

import java.util.Scanner;

public class ExD_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int a,b,c;
        double delta, x1, x2;

        System.out.print("Digite o Valor de A: ");
        a = ler.nextInt();

        System.out.print("Digite o Valor de B: ");
        b = ler.nextInt();

        System.out.print("Digite o Valor de C: ");
        c = ler.nextInt();

        ler.close();

        delta = (b*b) -4 * a * c;

        x1 = (-b + Math.sqrt(delta))/ (2 * a);
        x2 = (-b - Math.sqrt(delta))/ (2 * a);

        System.out.printf("Delta: %.2f", delta);

        if(delta > 0){
            System.out.println("\nExistem dois Valores para X, sendo distintos um do outro");
            System.out.printf("X1: %.2f", x1);
            System.out.printf("\nX2: %.2f", x2);
        }else if(delta < 0)
            System.out.println("\nNão há Solução");
        else{
            System.out.println("\nHá apenas um valor para X! ambos são iguais!");
            System.out.printf("X: %.2f", x1);
        }
            
    }
}
