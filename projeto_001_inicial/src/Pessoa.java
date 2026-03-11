public class Pessoa {
    // atributos: caracteristicas
    String nome;

    // construtor
    public Pessoa(String n){
        System.out.println("construtor parametrico acionado");
        nome = n;
    }

    // construtor padrao
    public Pessoa(){
        System.out.println("construtor padrao acionado");
    }

    // metodos: comportamento
    void cumprimentar(){
        System.out.println("Bom dia " + nome);
    }
}
