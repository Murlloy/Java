import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        double A, B, C;

        System.out.println("Digite um valor: ");
        A = ler.nextDouble();

        System.out.println("Digite um valor: ");
        B = ler.nextDouble();

        System.out.println("Digite um valor: ");
        C = ler.nextDouble();

        ler.close();

        double temp;

        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }if (A > C) {
            temp = A;
            A = C;
            C = temp;
        }if (B > C) {
            temp = B;
            B = C;
            C = temp;
        }

        System.out.println(A +" "+ B + " "+C);
    }
}
