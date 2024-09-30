package aula8;

public class Abdominal {

    private int abdominais;
    private int volta;

    public void treinar(int voltas, int abdominais) {

        for (this.volta = 1; this.volta <= voltas; this.volta++) {

            for (int i = 1; i <= abdominais; i++) {
                System.out.print(i + " ");
                this.abdominais++;
            }

            if (this.volta == 1)
                System.out.println("Primeira volta Feita!!");
            else if (this.volta == 2)
                System.out.println("Segunda volta feita!!");
            else if (this.volta == 3)
                System.out.println("Terceira volta feita!!");
            else
                System.out.println("Mais uma volta feita!!");
        }

        System.out.println("total de: " + this.abdominais + " Abdominais e " + (this.volta - 1) + " Voltas");

    }

}
