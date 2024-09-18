package ListaEx3;

public class ExF_MurilloF {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 200; i++){

            if(i%4 == 0){
                System.out.print(i + " ");
            }else
                continue;
        }
    }
}
