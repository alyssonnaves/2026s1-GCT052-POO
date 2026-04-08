package modelos8abr;

public class Cliente {
    private String nome;
    private static int qtd; // atributo de classe
    public static final int X = 10; // constante

    public Cliente(String nome){
        this.nome = nome;
        qtd++;  // incrementar o numero de objetos criados
        //X = 5;   // constante nao pode ser alterada
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public static int getQtd(){
        return qtd;
    }

}
