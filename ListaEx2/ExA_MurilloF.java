package ListaEx2;
import java.util.Scanner;

public class ExA_MurilloF {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double n1,n2;

        System.out.print("Escreva o Numero que deseja Subtrair: ");
        n1 = ler.nextDouble();

        System.out.print("Escreva outro numero: ");
        n2 = ler.nextDouble();

        ler.close();

        System.out.printf("A subtração de %.2f e %.2f é %.2f", n1,n2,n1-n2);

    }
}
