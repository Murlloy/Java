package aula8;

public class Aniversario {

    private int dia;
    private int mes;

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void verificarAniversario(int dia, int mes){
        if(mes == 2){

            if(dia == 15)
                System.out.println("Aniversario do Nauan!!");
            else if(dia == 8)
                System.out.println("Aniversario do Rafael!!");
            else if(dia == 28)
                System.out.println("Aniversario  da Rebecca!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");

        }else if(mes == 3){
            if(dia == 25)
                System.out.println("Aniversario da Sarah <3!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");

        }else if(mes == 4){
            if(dia == 13)
                System.out.println("Aniversario da Nicoly!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else if(mes == 6){
            if(dia == 16)
                System.out.println("Aniversario da Tais!!");
            else if (dia == 19)
                System.out.println("Aniversario do Murilo Rangel");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else if(mes == 7){
            if(dia == 17)
                System.out.println("Aniversario do Matheus!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else if(mes == 8){
            if(dia == 19)
                System.out.println("Aniversario do Murillo EU!!");
            else if(dia == 31)
                System.out.println("Aniversario da Maria (Duda)!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else if(mes == 9){
            if(dia == 25)
                System.out.println("Aniversario do Wallas!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else if(mes == 10){
            if(dia == 20)
                System.out.println("Aniversario do Pedro!!");
            else if(dia == 30)
                System.out.println("Aniversario do Yuri!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else if(mes == 11){
            if(dia == 3)
                System.out.println("Aniversario do Nikolas!!");
            else if(dia == 16)
                System.out.println("Aniversario do Thiago!!");
            else if(dia == 24)
                System.out.println("Aniversario do Valdir!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else if(mes == 12){
            if(dia == 6)
                System.out.println("Aniversario do Maxsuel!!");
            else if(dia == 10)
                System.out.println("Aniversario da Mari <3!!");
            else
                System.out.println("Ninguem faz aniversario nesse dia!!");
        }else
            System.out.println("Ninguem faz aniversario nesse dia!!"); 
            
        
    }

}
