package ListaEx3;

public class ExD_MurilloF {
    
    public static void main(String[] args) {

        int soma = 0;

        for(int i = 0; i <= 500; i++){

            if(i%2 == 0){
                soma += i;
            }else
                continue;
        }

        System.out.println(soma);
    }
}
