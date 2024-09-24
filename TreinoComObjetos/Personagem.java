package TreinoComObjetos;

public class Personagem {

    private String nome;
    private double dano;
    private double multiplicador;
    private boolean disponivel;

    public String getNome(){return this.nome;}
    public double getDano(){return this.dano;}
    public double getMultiplicador(){return this.multiplicador;}
    public boolean getDisponivel(){return this.disponivel;}

    public void setNome(String nome){this.nome = nome;}
    public void setDano(double dano){this.dano = dano;}
    public void setMultiplicador(double multiplicador){this.multiplicador = multiplicador;}
    public void setDisponivel(boolean disponivel){this.disponivel = disponivel;}


    
    public Personagem(String nome, double dano, double multiplicador){
        this.nome = nome;
        this.dano = dano;
        this.multiplicador = multiplicador;
    }

    public void pegar(){
        if(disponivel){
            disponivel = false;
            System.out.println("");
        }else
            System.out.println("Você não tem esse personagem!");
    }

    public void devolver(){
        if(disponivel){
            System.out.println("Não tem como devolver sem ter pego!");
        }else{
            disponivel = true;
            System.out.println("Devolvido com sucesso!");
        }
    }





}
